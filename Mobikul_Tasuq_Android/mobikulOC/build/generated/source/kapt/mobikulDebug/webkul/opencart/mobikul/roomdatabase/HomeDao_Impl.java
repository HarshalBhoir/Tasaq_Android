package webkul.opencart.mobikul.roomdatabase;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import webkul.opencart.mobikul.DataConvertor;
import webkul.opencart.mobikul.model.getHomePage.HomeDataModel;
import webkul.opencart.mobikul.roomtable.HomeDataTable;

@SuppressWarnings("unchecked")
public class HomeDao_Impl implements HomeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfHomeDataTable;

  private final DataConvertor __dataConvertor = new DataConvertor();

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfHomeDataTable;

  private final SharedSQLiteStatement __preparedStmtOfDeleteDatafromTable;

  public HomeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHomeDataTable = new EntityInsertionAdapter<HomeDataTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `homeData`(`count_id`,`homeData`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HomeDataTable value) {
        stmt.bindLong(1, value.getId());
        final String _tmp;
        _tmp = __dataConvertor.homeDataToString(value.getHomeDataModel());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
      }
    };
    this.__updateAdapterOfHomeDataTable = new EntityDeletionOrUpdateAdapter<HomeDataTable>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `homeData` SET `count_id` = ?,`homeData` = ? WHERE `count_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HomeDataTable value) {
        stmt.bindLong(1, value.getId());
        final String _tmp;
        _tmp = __dataConvertor.homeDataToString(value.getHomeDataModel());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        stmt.bindLong(3, value.getId());
      }
    };
    this.__preparedStmtOfDeleteDatafromTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM homeData";
        return _query;
      }
    };
  }

  @Override
  public long insertHomeProduct(HomeDataTable homeDataTable) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfHomeDataTable.insertAndReturnId(homeDataTable);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int upDatehomeData(HomeDataTable homeDataTable) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfHomeDataTable.handle(homeDataTable);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteDatafromTable() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteDatafromTable.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteDatafromTable.release(_stmt);
    }
  }

  @Override
  public HomeDataTable getHomeData() {
    final String _sql = "Select * FROM homeData ORDER BY count_id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("count_id");
      final int _cursorIndexOfHomeDataModel = _cursor.getColumnIndexOrThrow("homeData");
      final HomeDataTable _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final HomeDataModel _tmpHomeDataModel;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfHomeDataModel);
        _tmpHomeDataModel = __dataConvertor.fromStingToHomeData(_tmp);
        _result = new HomeDataTable(_tmpId,_tmpHomeDataModel);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
