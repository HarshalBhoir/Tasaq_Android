package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.button.MaterialButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import webkul.opencart.mobikul.BuildConfig;
import webkul.opencart.mobikul.handlers.MainActivityHandler;
import webkul.opencart.mobikul.loginlistener.LoginChecker;
import webkul.opencart.mobikul.model.getHomePage.HomeDataModel;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView aboutRecyclerview;

  @NonNull
  public final ViewPager bannerPager;

  @NonNull
  public final TextView browseByBrands;

  @NonNull
  public final LinearLayout browseByBrandsLayout;

  @NonNull
  public final TextView browseByBrandsViewAll;

  @NonNull
  public final RecyclerView carouselScroller;

  @NonNull
  public final FrameLayout container;

  @NonNull
  public final FrameLayout contentFrame;

  @NonNull
  public final LinearLayout currencyContainer;

  @NonNull
  public final LinearLayout dotGroup;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final LinearLayout header;

  @NonNull
  public final LinearLayout languageContainer;

  @NonNull
  public final RelativeLayout mainLayoutContainer;

  @NonNull
  public final ProgressBar mainProgressBar;

  @NonNull
  public final RecyclerView navDrawerRecyclerView;

  @NonNull
  public final RecyclerView navDrawerRecyclerViewCurrency;

  @NonNull
  public final RecyclerView navDrawerRecyclerViewLanguage;

  @NonNull
  public final BottomNavigationBinding navigation;

  @NonNull
  public final NavigationView navigationView;

  @NonNull
  public final TextView notificationInfo;

  @NonNull
  public final LinearLayout pagerLayout;

  @NonNull
  public final RecyclerView productCarousal;

  @NonNull
  public final RecyclerView recentViewed;

  @NonNull
  public final LinearLayout recentViewedContainer;

  @NonNull
  public final SwipeRefreshLayout refresh;

  @NonNull
  public final NestedScrollView scrollView;

  @NonNull
  public final TextView sellerProfile;

  @NonNull
  public final RecyclerView subCategoryRecyclerView;

  @NonNull
  public final MaterialButton toTop;

  @NonNull
  public final View toolbar;

  @Bindable
  protected LoginChecker mData;

  @Bindable
  protected BuildConfig mBuild;

  @Bindable
  protected HomeDataModel mHomedata;

  @Bindable
  protected MainActivityHandler mHandlers;

  protected ActivityMainBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RecyclerView aboutRecyclerview, ViewPager bannerPager,
      TextView browseByBrands, LinearLayout browseByBrandsLayout, TextView browseByBrandsViewAll,
      RecyclerView carouselScroller, FrameLayout container, FrameLayout contentFrame,
      LinearLayout currencyContainer, LinearLayout dotGroup, DrawerLayout drawerLayout,
      LinearLayout header, LinearLayout languageContainer, RelativeLayout mainLayoutContainer,
      ProgressBar mainProgressBar, RecyclerView navDrawerRecyclerView,
      RecyclerView navDrawerRecyclerViewCurrency, RecyclerView navDrawerRecyclerViewLanguage,
      BottomNavigationBinding navigation, NavigationView navigationView, TextView notificationInfo,
      LinearLayout pagerLayout, RecyclerView productCarousal, RecyclerView recentViewed,
      LinearLayout recentViewedContainer, SwipeRefreshLayout refresh, NestedScrollView scrollView,
      TextView sellerProfile, RecyclerView subCategoryRecyclerView, MaterialButton toTop,
      View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.aboutRecyclerview = aboutRecyclerview;
    this.bannerPager = bannerPager;
    this.browseByBrands = browseByBrands;
    this.browseByBrandsLayout = browseByBrandsLayout;
    this.browseByBrandsViewAll = browseByBrandsViewAll;
    this.carouselScroller = carouselScroller;
    this.container = container;
    this.contentFrame = contentFrame;
    this.currencyContainer = currencyContainer;
    this.dotGroup = dotGroup;
    this.drawerLayout = drawerLayout;
    this.header = header;
    this.languageContainer = languageContainer;
    this.mainLayoutContainer = mainLayoutContainer;
    this.mainProgressBar = mainProgressBar;
    this.navDrawerRecyclerView = navDrawerRecyclerView;
    this.navDrawerRecyclerViewCurrency = navDrawerRecyclerViewCurrency;
    this.navDrawerRecyclerViewLanguage = navDrawerRecyclerViewLanguage;
    this.navigation = navigation;
    setContainedBinding(this.navigation);;
    this.navigationView = navigationView;
    this.notificationInfo = notificationInfo;
    this.pagerLayout = pagerLayout;
    this.productCarousal = productCarousal;
    this.recentViewed = recentViewed;
    this.recentViewedContainer = recentViewedContainer;
    this.refresh = refresh;
    this.scrollView = scrollView;
    this.sellerProfile = sellerProfile;
    this.subCategoryRecyclerView = subCategoryRecyclerView;
    this.toTop = toTop;
    this.toolbar = toolbar;
  }

  public abstract void setData(@Nullable LoginChecker data);

  @Nullable
  public LoginChecker getData() {
    return mData;
  }

  public abstract void setBuild(@Nullable BuildConfig build);

  @Nullable
  public BuildConfig getBuild() {
    return mBuild;
  }

  public abstract void setHomedata(@Nullable HomeDataModel homedata);

  @Nullable
  public HomeDataModel getHomedata() {
    return mHomedata;
  }

  public abstract void setHandlers(@Nullable MainActivityHandler handlers);

  @Nullable
  public MainActivityHandler getHandlers() {
    return mHandlers;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMainBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMainBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityMainBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityMainBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_main);
  }
}
