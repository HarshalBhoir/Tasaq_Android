package webkul.opencart.mobikul.roomdatabase;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class RoomDao_Impl implements RoomDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfRecentViewedTable;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRecentViewedProduct;

  private final SharedSQLiteStatement __preparedStmtOfDeleteDatafromTable;

  public RoomDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRecentViewedTable = new EntityInsertionAdapter<RecentViewedTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `recentViewed`(`count_id`,`id`,`name`,`image`,`price`,`specialprice`,`formattedSpecial`,`hasoption`,`wishlist_status`,`time_stamp`,`domiantColor`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RecentViewedTable value) {
        stmt.bindLong(1, value.getId());
        if (value.getProductId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getProductId());
        }
        if (value.getProuductName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getProuductName());
        }
        if (value.getProductImage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getProductImage());
        }
        if (value.getProductPrice() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getProductPrice());
        }
        if (value.getProductSpecialPrice() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getProductSpecialPrice());
        }
        if (value.getFormattedSpecial() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getFormattedSpecial());
        }
        final int _tmp;
        _tmp = value.getProductHasOption() ? 1 : 0;
        stmt.bindLong(8, _tmp);
        final Integer _tmp_1;
        _tmp_1 = value.getWishlist_status() == null ? null : (value.getWishlist_status() ? 1 : 0);
        if (_tmp_1 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, _tmp_1);
        }
        if (value.getProductTimeStamp() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getProductTimeStamp());
        }
        if (value.getDominantColor() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getDominantColor());
        }
      }
    };
    this.__preparedStmtOfDeleteRecentViewedProduct = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM recentViewed WHERE count_id < ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteDatafromTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM recentViewed";
        return _query;
      }
    };
  }

  @Override
  public long insertRecentViewedProduct(RecentViewedTable recentViewedTable) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfRecentViewedTable.insertAndReturnId(recentViewedTable);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteRecentViewedProduct(String productIdVal) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteRecentViewedProduct.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (productIdVal == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, productIdVal);
      }
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteRecentViewedProduct.release(_stmt);
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
  public List<RecentViewedTable> getRecentViewedProduct() {
    final String _sql = "Select * FROM recentViewed ORDER BY time_stamp DESC LIMIT 10 ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("count_id");
      final int _cursorIndexOfProductId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfProuductName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfProductImage = _cursor.getColumnIndexOrThrow("image");
      final int _cursorIndexOfProductPrice = _cursor.getColumnIndexOrThrow("price");
      final int _cursorIndexOfProductSpecialPrice = _cursor.getColumnIndexOrThrow("specialprice");
      final int _cursorIndexOfFormattedSpecial = _cursor.getColumnIndexOrThrow("formattedSpecial");
      final int _cursorIndexOfProductHasOption = _cursor.getColumnIndexOrThrow("hasoption");
      final int _cursorIndexOfWishlistStatus = _cursor.getColumnIndexOrThrow("wishlist_status");
      final int _cursorIndexOfProductTimeStamp = _cursor.getColumnIndexOrThrow("time_stamp");
      final int _cursorIndexOfDominantColor = _cursor.getColumnIndexOrThrow("domiantColor");
      final List<RecentViewedTable> _result = new ArrayList<RecentViewedTable>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final RecentViewedTable _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpProductId;
        _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
        final String _tmpProuductName;
        _tmpProuductName = _cursor.getString(_cursorIndexOfProuductName);
        final String _tmpProductImage;
        _tmpProductImage = _cursor.getString(_cursorIndexOfProductImage);
        final String _tmpProductPrice;
        _tmpProductPrice = _cursor.getString(_cursorIndexOfProductPrice);
        final String _tmpProductSpecialPrice;
        _tmpProductSpecialPrice = _cursor.getString(_cursorIndexOfProductSpecialPrice);
        final String _tmpFormattedSpecial;
        _tmpFormattedSpecial = _cursor.getString(_cursorIndexOfFormattedSpecial);
        final boolean _tmpProductHasOption;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfProductHasOption);
        _tmpProductHasOption = _tmp != 0;
        final Boolean _tmpWishlist_status;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfWishlistStatus)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfWishlistStatus);
        }
        _tmpWishlist_status = _tmp_1 == null ? null : _tmp_1 != 0;
        final String _tmpProductTimeStamp;
        _tmpProductTimeStamp = _cursor.getString(_cursorIndexOfProductTimeStamp);
        final String _tmpDominantColor;
        _tmpDominantColor = _cursor.getString(_cursorIndexOfDominantColor);
        _item = new RecentViewedTable(_tmpId,_tmpProductId,_tmpProuductName,_tmpProductImage,_tmpProductPrice,_tmpProductSpecialPrice,_tmpFormattedSpecial,_tmpProductHasOption,_tmpWishlist_status,_tmpProductTimeStamp,_tmpDominantColor);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
