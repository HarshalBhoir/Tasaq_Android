package webkul.opencart.mobikul.roomdatabase;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class RecentSearchDao_Impl implements RecentSearchDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfRecentSearchTable;

  private final SharedSQLiteStatement __preparedStmtOfDeleteDatafromResentSearchTable;

  public RecentSearchDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRecentSearchTable = new EntityInsertionAdapter<RecentSearchTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `recentSearch`(`id`,`word`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RecentSearchTable value) {
        stmt.bindLong(1, value.getId());
        if (value.getWord() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getWord());
        }
      }
    };
    this.__preparedStmtOfDeleteDatafromResentSearchTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM recentViewed";
        return _query;
      }
    };
  }

  @Override
  public void insertSearchWord(RecentSearchTable recentSearchTable) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfRecentSearchTable.insert(recentSearchTable);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteDatafromResentSearchTable() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteDatafromResentSearchTable.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteDatafromResentSearchTable.release(_stmt);
    }
  }

  @Override
  public List<RecentSearchTable> getRecentSearch() {
    final String _sql = "SELECT * from recentSearch ORDER BY id DESC LIMIT 10";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfWord = _cursor.getColumnIndexOrThrow("word");
      final List<RecentSearchTable> _result = new ArrayList<RecentSearchTable>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final RecentSearchTable _item;
        _item = new RecentSearchTable();
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpWord;
        _tmpWord = _cursor.getString(_cursorIndexOfWord);
        _item.setWord(_tmpWord);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
