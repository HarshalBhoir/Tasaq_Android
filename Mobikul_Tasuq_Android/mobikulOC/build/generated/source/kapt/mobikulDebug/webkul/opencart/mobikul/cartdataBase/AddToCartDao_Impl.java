package webkul.opencart.mobikul.cartdataBase;

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
public class AddToCartDao_Impl implements AddToCartDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfAddCartTable;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAddToCart;

  public AddToCartDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAddCartTable = new EntityInsertionAdapter<AddCartTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `addCart`(`count_id`,`id`,`qty`,`json`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AddCartTable value) {
        stmt.bindLong(1, value.getId());
        if (value.getProductId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getProductId());
        }
        if (value.getQty() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getQty());
        }
        if (value.getJsonObject() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getJsonObject());
        }
      }
    };
    this.__preparedStmtOfDeleteAddToCart = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM addCart WHERE id == ?";
        return _query;
      }
    };
  }

  @Override
  public void insertAddToCart(AddCartTable addCartTable) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfAddCartTable.insert(addCartTable);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteAddToCart(String productID) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAddToCart.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (productID == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, productID);
      }
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAddToCart.release(_stmt);
    }
  }

  @Override
  public List<AddCartTable> getAddToCart() {
    final String _sql = "SELECT * from addCart ORDER BY id DESC LIMIT 10";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("count_id");
      final int _cursorIndexOfProductId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfQty = _cursor.getColumnIndexOrThrow("qty");
      final int _cursorIndexOfJsonObject = _cursor.getColumnIndexOrThrow("json");
      final List<AddCartTable> _result = new ArrayList<AddCartTable>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final AddCartTable _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpProductId;
        _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
        final String _tmpQty;
        _tmpQty = _cursor.getString(_cursorIndexOfQty);
        final String _tmpJsonObject;
        _tmpJsonObject = _cursor.getString(_cursorIndexOfJsonObject);
        _item = new AddCartTable(_tmpId,_tmpProductId,_tmpQty,_tmpJsonObject);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
