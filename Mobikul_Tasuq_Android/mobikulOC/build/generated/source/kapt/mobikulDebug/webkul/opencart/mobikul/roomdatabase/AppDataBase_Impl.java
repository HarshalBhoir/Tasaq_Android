package webkul.opencart.mobikul.roomdatabase;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import webkul.opencart.mobikul.cartdataBase.AddToCartDao;
import webkul.opencart.mobikul.cartdataBase.AddToCartDao_Impl;

@SuppressWarnings("unchecked")
public class AppDataBase_Impl extends AppDataBase {
  private volatile RoomDao _roomDao;

  private volatile HomeDao _homeDao;

  private volatile RecentSearchDao _recentSearchDao;

  private volatile AddToCartDao _addToCartDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(12) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `recentViewed` (`count_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `id` TEXT NOT NULL, `name` TEXT NOT NULL, `image` TEXT NOT NULL, `price` TEXT NOT NULL, `specialprice` TEXT NOT NULL, `formattedSpecial` TEXT NOT NULL, `hasoption` INTEGER NOT NULL, `wishlist_status` INTEGER, `time_stamp` TEXT, `domiantColor` TEXT)");
        _db.execSQL("CREATE UNIQUE INDEX `index_recentViewed_id` ON `recentViewed` (`id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `homeData` (`count_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `homeData` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `recentSearch` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `word` TEXT NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX `index_recentSearch_word` ON `recentSearch` (`word`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `addCart` (`count_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `id` TEXT NOT NULL, `qty` TEXT NOT NULL, `json` TEXT NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX `index_addCart_id` ON `addCart` (`id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"b3fab0bfdc45dc6f8a846f4f43f12f19\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `recentViewed`");
        _db.execSQL("DROP TABLE IF EXISTS `homeData`");
        _db.execSQL("DROP TABLE IF EXISTS `recentSearch`");
        _db.execSQL("DROP TABLE IF EXISTS `addCart`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsRecentViewed = new HashMap<String, TableInfo.Column>(11);
        _columnsRecentViewed.put("count_id", new TableInfo.Column("count_id", "INTEGER", true, 1));
        _columnsRecentViewed.put("id", new TableInfo.Column("id", "TEXT", true, 0));
        _columnsRecentViewed.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsRecentViewed.put("image", new TableInfo.Column("image", "TEXT", true, 0));
        _columnsRecentViewed.put("price", new TableInfo.Column("price", "TEXT", true, 0));
        _columnsRecentViewed.put("specialprice", new TableInfo.Column("specialprice", "TEXT", true, 0));
        _columnsRecentViewed.put("formattedSpecial", new TableInfo.Column("formattedSpecial", "TEXT", true, 0));
        _columnsRecentViewed.put("hasoption", new TableInfo.Column("hasoption", "INTEGER", true, 0));
        _columnsRecentViewed.put("wishlist_status", new TableInfo.Column("wishlist_status", "INTEGER", false, 0));
        _columnsRecentViewed.put("time_stamp", new TableInfo.Column("time_stamp", "TEXT", false, 0));
        _columnsRecentViewed.put("domiantColor", new TableInfo.Column("domiantColor", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRecentViewed = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRecentViewed = new HashSet<TableInfo.Index>(1);
        _indicesRecentViewed.add(new TableInfo.Index("index_recentViewed_id", true, Arrays.asList("id")));
        final TableInfo _infoRecentViewed = new TableInfo("recentViewed", _columnsRecentViewed, _foreignKeysRecentViewed, _indicesRecentViewed);
        final TableInfo _existingRecentViewed = TableInfo.read(_db, "recentViewed");
        if (! _infoRecentViewed.equals(_existingRecentViewed)) {
          throw new IllegalStateException("Migration didn't properly handle recentViewed(webkul.opencart.mobikul.roomdatabase.RecentViewedTable).\n"
                  + " Expected:\n" + _infoRecentViewed + "\n"
                  + " Found:\n" + _existingRecentViewed);
        }
        final HashMap<String, TableInfo.Column> _columnsHomeData = new HashMap<String, TableInfo.Column>(2);
        _columnsHomeData.put("count_id", new TableInfo.Column("count_id", "INTEGER", true, 1));
        _columnsHomeData.put("homeData", new TableInfo.Column("homeData", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHomeData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHomeData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHomeData = new TableInfo("homeData", _columnsHomeData, _foreignKeysHomeData, _indicesHomeData);
        final TableInfo _existingHomeData = TableInfo.read(_db, "homeData");
        if (! _infoHomeData.equals(_existingHomeData)) {
          throw new IllegalStateException("Migration didn't properly handle homeData(webkul.opencart.mobikul.roomtable.HomeDataTable).\n"
                  + " Expected:\n" + _infoHomeData + "\n"
                  + " Found:\n" + _existingHomeData);
        }
        final HashMap<String, TableInfo.Column> _columnsRecentSearch = new HashMap<String, TableInfo.Column>(2);
        _columnsRecentSearch.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsRecentSearch.put("word", new TableInfo.Column("word", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRecentSearch = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRecentSearch = new HashSet<TableInfo.Index>(1);
        _indicesRecentSearch.add(new TableInfo.Index("index_recentSearch_word", true, Arrays.asList("word")));
        final TableInfo _infoRecentSearch = new TableInfo("recentSearch", _columnsRecentSearch, _foreignKeysRecentSearch, _indicesRecentSearch);
        final TableInfo _existingRecentSearch = TableInfo.read(_db, "recentSearch");
        if (! _infoRecentSearch.equals(_existingRecentSearch)) {
          throw new IllegalStateException("Migration didn't properly handle recentSearch(webkul.opencart.mobikul.roomdatabase.RecentSearchTable).\n"
                  + " Expected:\n" + _infoRecentSearch + "\n"
                  + " Found:\n" + _existingRecentSearch);
        }
        final HashMap<String, TableInfo.Column> _columnsAddCart = new HashMap<String, TableInfo.Column>(4);
        _columnsAddCart.put("count_id", new TableInfo.Column("count_id", "INTEGER", true, 1));
        _columnsAddCart.put("id", new TableInfo.Column("id", "TEXT", true, 0));
        _columnsAddCart.put("qty", new TableInfo.Column("qty", "TEXT", true, 0));
        _columnsAddCart.put("json", new TableInfo.Column("json", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAddCart = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAddCart = new HashSet<TableInfo.Index>(1);
        _indicesAddCart.add(new TableInfo.Index("index_addCart_id", true, Arrays.asList("id")));
        final TableInfo _infoAddCart = new TableInfo("addCart", _columnsAddCart, _foreignKeysAddCart, _indicesAddCart);
        final TableInfo _existingAddCart = TableInfo.read(_db, "addCart");
        if (! _infoAddCart.equals(_existingAddCart)) {
          throw new IllegalStateException("Migration didn't properly handle addCart(webkul.opencart.mobikul.cartdataBase.AddCartTable).\n"
                  + " Expected:\n" + _infoAddCart + "\n"
                  + " Found:\n" + _existingAddCart);
        }
      }
    }, "b3fab0bfdc45dc6f8a846f4f43f12f19", "7343d5455d6fcda4121e2875a79cad06");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "recentViewed","homeData","recentSearch","addCart");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `recentViewed`");
      _db.execSQL("DELETE FROM `homeData`");
      _db.execSQL("DELETE FROM `recentSearch`");
      _db.execSQL("DELETE FROM `addCart`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public RoomDao getDao() {
    if (_roomDao != null) {
      return _roomDao;
    } else {
      synchronized(this) {
        if(_roomDao == null) {
          _roomDao = new RoomDao_Impl(this);
        }
        return _roomDao;
      }
    }
  }

  @Override
  public HomeDao getHomeDao() {
    if (_homeDao != null) {
      return _homeDao;
    } else {
      synchronized(this) {
        if(_homeDao == null) {
          _homeDao = new HomeDao_Impl(this);
        }
        return _homeDao;
      }
    }
  }

  @Override
  public RecentSearchDao getRecentSearchDao() {
    if (_recentSearchDao != null) {
      return _recentSearchDao;
    } else {
      synchronized(this) {
        if(_recentSearchDao == null) {
          _recentSearchDao = new RecentSearchDao_Impl(this);
        }
        return _recentSearchDao;
      }
    }
  }

  @Override
  public AddToCartDao getAddToCartDao() {
    if (_addToCartDao != null) {
      return _addToCartDao;
    } else {
      synchronized(this) {
        if(_addToCartDao == null) {
          _addToCartDao = new AddToCartDao_Impl(this);
        }
        return _addToCartDao;
      }
    }
  }
}
