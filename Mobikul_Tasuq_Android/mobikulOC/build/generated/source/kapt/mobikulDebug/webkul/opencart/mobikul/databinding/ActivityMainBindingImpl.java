package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(43);
        sIncludes.setIncludes(1, 
            new String[] {"bottom_navigation"},
            new int[] {29},
            new int[] {R.layout.bottom_navigation});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 28);
        sViewsWithIds.put(R.id.header, 30);
        sViewsWithIds.put(R.id.container, 31);
        sViewsWithIds.put(R.id.refresh, 32);
        sViewsWithIds.put(R.id.content_frame, 33);
        sViewsWithIds.put(R.id.scroll_view, 34);
        sViewsWithIds.put(R.id.pagerLayout, 35);
        sViewsWithIds.put(R.id.dot_group, 36);
        sViewsWithIds.put(R.id.browseByBrands_layout, 37);
        sViewsWithIds.put(R.id.browseByBrands, 38);
        sViewsWithIds.put(R.id.recent_viewed_container, 39);
        sViewsWithIds.put(R.id.recent_viewed, 40);
        sViewsWithIds.put(R.id.main_progress_bar, 41);
        sViewsWithIds.put(R.id.navigation_view, 42);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.view.View mboundView17;
    @NonNull
    private final android.view.View mboundView19;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.TextView mboundView20;
    @NonNull
    private final android.widget.LinearLayout mboundView22;
    @NonNull
    private final android.view.View mboundView23;
    @NonNull
    private final android.view.View mboundView25;
    @NonNull
    private final android.widget.TextView mboundView26;
    @NonNull
    private final android.widget.TextView mboundView27;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 43, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.support.v7.widget.RecyclerView) bindings[21]
            , (android.support.v4.view.ViewPager) bindings[3]
            , (android.widget.TextView) bindings[38]
            , (android.widget.LinearLayout) bindings[37]
            , (android.widget.TextView) bindings[6]
            , (android.support.v7.widget.RecyclerView) bindings[7]
            , (android.widget.FrameLayout) bindings[31]
            , (android.widget.FrameLayout) bindings[33]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[36]
            , (android.support.v4.widget.DrawerLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[30]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.ProgressBar) bindings[41]
            , (android.support.v7.widget.RecyclerView) bindings[9]
            , (android.support.v7.widget.RecyclerView) bindings[16]
            , (android.support.v7.widget.RecyclerView) bindings[14]
            , (webkul.opencart.mobikul.databinding.BottomNavigationBinding) bindings[29]
            , (android.support.design.widget.NavigationView) bindings[42]
            , (android.widget.TextView) bindings[18]
            , (android.widget.LinearLayout) bindings[35]
            , (android.support.v7.widget.RecyclerView) bindings[5]
            , (android.support.v7.widget.RecyclerView) bindings[40]
            , (android.widget.LinearLayout) bindings[39]
            , (android.support.v4.widget.SwipeRefreshLayout) bindings[32]
            , (android.support.v4.widget.NestedScrollView) bindings[34]
            , (android.widget.TextView) bindings[24]
            , (android.support.v7.widget.RecyclerView) bindings[4]
            , (android.support.design.button.MaterialButton) bindings[8]
            , (android.view.View) bindings[28]
            );
        this.aboutRecyclerview.setTag(null);
        this.bannerPager.setTag(null);
        this.browseByBrandsViewAll.setTag(null);
        this.carouselScroller.setTag(null);
        this.currencyContainer.setTag(null);
        this.drawerLayout.setTag(null);
        this.languageContainer.setTag(null);
        this.mainLayoutContainer.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView17 = (android.view.View) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView19 = (android.view.View) bindings[19];
        this.mboundView19.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView20 = (android.widget.TextView) bindings[20];
        this.mboundView20.setTag(null);
        this.mboundView22 = (android.widget.LinearLayout) bindings[22];
        this.mboundView22.setTag(null);
        this.mboundView23 = (android.view.View) bindings[23];
        this.mboundView23.setTag(null);
        this.mboundView25 = (android.view.View) bindings[25];
        this.mboundView25.setTag(null);
        this.mboundView26 = (android.widget.TextView) bindings[26];
        this.mboundView26.setTag(null);
        this.mboundView27 = (android.widget.TextView) bindings[27];
        this.mboundView27.setTag(null);
        this.navDrawerRecyclerView.setTag(null);
        this.navDrawerRecyclerViewCurrency.setTag(null);
        this.navDrawerRecyclerViewLanguage.setTag(null);
        this.notificationInfo.setTag(null);
        this.productCarousal.setTag(null);
        this.sellerProfile.setTag(null);
        this.subCategoryRecyclerView.setTag(null);
        this.toTop.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 5);
        mCallback16 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 6);
        mCallback13 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 3);
        mCallback14 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 4);
        mCallback11 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
        mCallback12 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 2);
        mCallback17 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 7);
        mCallback18 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 8);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        navigation.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (navigation.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.homedata == variableId) {
            setHomedata((webkul.opencart.mobikul.model.getHomePage.HomeDataModel) variable);
        }
        else if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.loginlistener.LoginChecker) variable);
        }
        else if (BR.handlers == variableId) {
            setHandlers((webkul.opencart.mobikul.handlers.MainActivityHandler) variable);
        }
        else if (BR.build == variableId) {
            setBuild((webkul.opencart.mobikul.BuildConfig) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHomedata(@Nullable webkul.opencart.mobikul.model.getHomePage.HomeDataModel Homedata) {
        this.mHomedata = Homedata;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.homedata);
        super.requestRebind();
    }
    public void setData(@Nullable webkul.opencart.mobikul.loginlistener.LoginChecker Data) {
        this.mData = Data;
    }
    public void setHandlers(@Nullable webkul.opencart.mobikul.handlers.MainActivityHandler Handlers) {
        this.mHandlers = Handlers;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.handlers);
        super.requestRebind();
    }
    public void setBuild(@Nullable webkul.opencart.mobikul.BuildConfig Build) {
        this.mBuild = Build;
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        navigation.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeNavigation((webkul.opencart.mobikul.databinding.BottomNavigationBinding) object, fieldId);
            case 1 :
                return onChangeData((webkul.opencart.mobikul.loginlistener.LoginChecker) object, fieldId);
        }
        return false;
    }
    private boolean onChangeNavigation(webkul.opencart.mobikul.databinding.BottomNavigationBinding Navigation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeData(webkul.opencart.mobikul.loginlistener.LoginChecker Data, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean homedataCurrenciesCurrenciesSizeInt1 = false;
        int homedataPartnerApproveRequiredViewGONEViewVISIBLE = 0;
        webkul.opencart.mobikul.model.getHomePage.HomeDataModel homedata = mHomedata;
        java.util.ArrayList<webkul.opencart.mobikul.model.getHomePage.Banner> homedataBanners = null;
        java.util.List<webkul.opencart.mobikul.model.getHomePage.Currency> homedataCurrenciesCurrencies = null;
        int homedataGdprStatus = 0;
        java.util.List<webkul.opencart.mobikul.model.getHomePage.Language> homedataLanguagesLanguages = null;
        int homedataPartnerApproveRequiredViewVISIBLEViewGONE = 0;
        boolean homedataFooterMenuSizeInt0 = false;
        int homedataFooterMenuSize = 0;
        boolean homedataGdprNotificationStatusInt1 = false;
        int homedataFooterMenuSizeInt0ViewVISIBLEViewGONE = 0;
        java.util.ArrayList<webkul.opencart.mobikul.model.getHomePage.Modules> homedataModules = null;
        boolean homedataGdprStatusInt1HomedataGdprNotificationStatusInt1BooleanFalse = false;
        int homedataPartnerInt0HomedataPartnerApproveRequiredViewGONEViewVISIBLEViewGONE = 0;
        int homedataCurrenciesCurrenciesSizeInt1ViewGONEViewVISIBLE = 0;
        java.util.ArrayList<webkul.opencart.mobikul.model.getHomePage.Carousel> homedataCarousalList = null;
        int homedataCurrenciesCurrenciesSize = 0;
        webkul.opencart.mobikul.model.getHomePage.Languages homedataLanguages = null;
        java.lang.Boolean homedataPartnerApproveRequired = null;
        boolean androidDatabindingViewDataBindingSafeUnboxHomedataPartnerApproveRequired = false;
        int homedataGdprNotificationStatus = 0;
        int homedataGdprStatusInt1HomedataGdprNotificationStatusInt1BooleanFalseViewVISIBLEViewGONE = 0;
        java.util.ArrayList<webkul.opencart.mobikul.model.getHomePage.FooterMenu> homedataFooterMenu = null;
        webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
        boolean homedataLanguagesLanguagesSizeInt1 = false;
        boolean homedataGdprStatusInt1 = false;
        int homedataPartner = 0;
        int homedataLanguagesLanguagesSize = 0;
        int homedataLanguagesLanguagesSizeInt1ViewGONEViewVISIBLE = 0;
        boolean homedataPartnerInt0 = false;
        webkul.opencart.mobikul.model.getHomePage.Currencies homedataCurrencies = null;
        int homedataPartnerInt0HomedataPartnerApproveRequiredViewVISIBLEViewGONEViewGONE = 0;
        java.util.List<webkul.opencart.mobikul.model.getHomePage.Category> homedataCategories = null;

        if ((dirtyFlags & 0x24L) != 0) {



                if (homedata != null) {
                    // read homedata.banners
                    homedataBanners = homedata.getBanners();
                    // read homedata.gdprStatus
                    homedataGdprStatus = homedata.getGdprStatus();
                    // read homedata.modules
                    homedataModules = homedata.getModules();
                    // read homedata.carousalList
                    homedataCarousalList = homedata.getCarousalList();
                    // read homedata.languages
                    homedataLanguages = homedata.getLanguages();
                    // read homedata.footerMenu
                    homedataFooterMenu = homedata.getFooterMenu();
                    // read homedata.partner
                    homedataPartner = homedata.getPartner();
                    // read homedata.currencies
                    homedataCurrencies = homedata.getCurrencies();
                    // read homedata.categories
                    homedataCategories = homedata.getCategories();
                }


                // read homedata.gdprStatus == 1
                homedataGdprStatusInt1 = (homedataGdprStatus) == (1);
                // read homedata.partner == 0
                homedataPartnerInt0 = (homedataPartner) == (0);
            if((dirtyFlags & 0x24L) != 0) {
                if(homedataGdprStatusInt1) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }
            if((dirtyFlags & 0x24L) != 0) {
                if(homedataPartnerInt0) {
                        dirtyFlags |= 0x20000L;
                        dirtyFlags |= 0x2000000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                        dirtyFlags |= 0x1000000L;
                }
            }
                if (homedataLanguages != null) {
                    // read homedata.languages.languages
                    homedataLanguagesLanguages = homedataLanguages.getLanguages();
                }
                if (homedataFooterMenu != null) {
                    // read homedata.footerMenu.size()
                    homedataFooterMenuSize = homedataFooterMenu.size();
                }
                if (homedataCurrencies != null) {
                    // read homedata.currencies.currencies
                    homedataCurrenciesCurrencies = homedataCurrencies.getCurrencies();
                }


                if (homedataLanguagesLanguages != null) {
                    // read homedata.languages.languages.size()
                    homedataLanguagesLanguagesSize = homedataLanguagesLanguages.size();
                }
                // read homedata.footerMenu.size() != 0
                homedataFooterMenuSizeInt0 = (homedataFooterMenuSize) != (0);
            if((dirtyFlags & 0x24L) != 0) {
                if(homedataFooterMenuSizeInt0) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }
                if (homedataCurrenciesCurrencies != null) {
                    // read homedata.currencies.currencies.size()
                    homedataCurrenciesCurrenciesSize = homedataCurrenciesCurrencies.size();
                }


                // read homedata.languages.languages.size() <= 1
                homedataLanguagesLanguagesSizeInt1 = (homedataLanguagesLanguagesSize) <= (1);
                // read homedata.footerMenu.size() != 0 ? View.VISIBLE : View.GONE
                homedataFooterMenuSizeInt0ViewVISIBLEViewGONE = ((homedataFooterMenuSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read homedata.currencies.currencies.size() <= 1
                homedataCurrenciesCurrenciesSizeInt1 = (homedataCurrenciesCurrenciesSize) <= (1);
            if((dirtyFlags & 0x24L) != 0) {
                if(homedataLanguagesLanguagesSizeInt1) {
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x400000L;
                }
            }
            if((dirtyFlags & 0x24L) != 0) {
                if(homedataCurrenciesCurrenciesSizeInt1) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }


                // read homedata.languages.languages.size() <= 1 ? View.GONE : View.VISIBLE
                homedataLanguagesLanguagesSizeInt1ViewGONEViewVISIBLE = ((homedataLanguagesLanguagesSizeInt1) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read homedata.currencies.currencies.size() <= 1 ? View.GONE : View.VISIBLE
                homedataCurrenciesCurrenciesSizeInt1ViewGONEViewVISIBLE = ((homedataCurrenciesCurrenciesSizeInt1) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x20L) != 0) {

            if((dirtyFlags & 0x20L) != 0) {
                if(webkul.opencart.mobikul.BuildConfig.isMobikul) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x2020000L) != 0) {

                if (homedata != null) {
                    // read homedata.partnerApproveRequired
                    homedataPartnerApproveRequired = homedata.getPartnerApproveRequired();
                }


                // read android.databinding.ViewDataBinding.safeUnbox(homedata.partnerApproveRequired)
                androidDatabindingViewDataBindingSafeUnboxHomedataPartnerApproveRequired = android.databinding.ViewDataBinding.safeUnbox(homedataPartnerApproveRequired);
            if((dirtyFlags & 0x20000L) != 0) {
                if(androidDatabindingViewDataBindingSafeUnboxHomedataPartnerApproveRequired) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
            if((dirtyFlags & 0x2000000L) != 0) {
                if(androidDatabindingViewDataBindingSafeUnboxHomedataPartnerApproveRequired) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }

            if ((dirtyFlags & 0x20000L) != 0) {

                    // read android.databinding.ViewDataBinding.safeUnbox(homedata.partnerApproveRequired) ? View.GONE : View.VISIBLE
                    homedataPartnerApproveRequiredViewGONEViewVISIBLE = ((androidDatabindingViewDataBindingSafeUnboxHomedataPartnerApproveRequired) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x2000000L) != 0) {

                    // read android.databinding.ViewDataBinding.safeUnbox(homedata.partnerApproveRequired) ? View.VISIBLE : View.GONE
                    homedataPartnerApproveRequiredViewVISIBLEViewGONE = ((androidDatabindingViewDataBindingSafeUnboxHomedataPartnerApproveRequired) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0x8000L) != 0) {

                if (homedata != null) {
                    // read homedata.gdprNotificationStatus
                    homedataGdprNotificationStatus = homedata.getGdprNotificationStatus();
                }


                // read homedata.gdprNotificationStatus == 1
                homedataGdprNotificationStatusInt1 = (homedataGdprNotificationStatus) == (1);
        }

        if ((dirtyFlags & 0x24L) != 0) {

                // read homedata.gdprStatus == 1 ? homedata.gdprNotificationStatus == 1 : false
                homedataGdprStatusInt1HomedataGdprNotificationStatusInt1BooleanFalse = ((homedataGdprStatusInt1) ? (homedataGdprNotificationStatusInt1) : (false));
                // read homedata.partner == 0 ? android.databinding.ViewDataBinding.safeUnbox(homedata.partnerApproveRequired) ? View.GONE : View.VISIBLE : View.GONE
                homedataPartnerInt0HomedataPartnerApproveRequiredViewGONEViewVISIBLEViewGONE = ((homedataPartnerInt0) ? (homedataPartnerApproveRequiredViewGONEViewVISIBLE) : (android.view.View.GONE));
                // read homedata.partner == 0 ? android.databinding.ViewDataBinding.safeUnbox(homedata.partnerApproveRequired) ? View.VISIBLE : View.GONE : View.GONE
                homedataPartnerInt0HomedataPartnerApproveRequiredViewVISIBLEViewGONEViewGONE = ((homedataPartnerInt0) ? (homedataPartnerApproveRequiredViewVISIBLEViewGONE) : (android.view.View.GONE));
            if((dirtyFlags & 0x24L) != 0) {
                if(homedataGdprStatusInt1HomedataGdprNotificationStatusInt1BooleanFalse) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }


                // read homedata.gdprStatus == 1 ? homedata.gdprNotificationStatus == 1 : false ? View.VISIBLE : View.GONE
                homedataGdprStatusInt1HomedataGdprNotificationStatusInt1BooleanFalseViewVISIBLEViewGONE = ((homedataGdprStatusInt1HomedataGdprNotificationStatusInt1BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            webkul.opencart.mobikul.utils.HomePageLayoutBinder.bindAbout(this.aboutRecyclerview, homedataFooterMenu);
            webkul.opencart.mobikul.utils.HomePageLayoutBinder.bindPager(this.bannerPager, homedataBanners);
            webkul.opencart.mobikul.utils.HomePageLayoutBinder.bindBrandsView(this.carouselScroller, homedataCarousalList);
            this.currencyContainer.setVisibility(homedataCurrenciesCurrenciesSizeInt1ViewGONEViewVISIBLE);
            this.languageContainer.setVisibility(homedataLanguagesLanguagesSizeInt1ViewGONEViewVISIBLE);
            this.mboundView17.setVisibility(homedataGdprStatusInt1HomedataGdprNotificationStatusInt1BooleanFalseViewVISIBLEViewGONE);
            this.mboundView19.setVisibility(homedataGdprStatusInt1HomedataGdprNotificationStatusInt1BooleanFalseViewVISIBLEViewGONE);
            this.mboundView20.setVisibility(homedataFooterMenuSizeInt0ViewVISIBLEViewGONE);
            this.mboundView26.setVisibility(homedataPartnerInt0HomedataPartnerApproveRequiredViewGONEViewVISIBLEViewGONE);
            this.mboundView27.setVisibility(homedataPartnerInt0HomedataPartnerApproveRequiredViewVISIBLEViewGONEViewGONE);
            webkul.opencart.mobikul.utils.HomePageLayoutBinder.bindNavigationView(this.navDrawerRecyclerView, homedataCategories);
            webkul.opencart.mobikul.utils.HomePageLayoutBinder.bindCurrencyView(this.navDrawerRecyclerViewCurrency, homedataCurrencies);
            webkul.opencart.mobikul.utils.HomePageLayoutBinder.bindLanguageView(this.navDrawerRecyclerViewLanguage, homedataLanguages);
            this.notificationInfo.setVisibility(homedataGdprStatusInt1HomedataGdprNotificationStatusInt1BooleanFalseViewVISIBLEViewGONE);
            webkul.opencart.mobikul.utils.HomePageLayoutBinder.bindProductCarousal(this.productCarousal, homedataModules);
            webkul.opencart.mobikul.utils.HomePageLayoutBinder.bindSubCategoryView(this.subCategoryRecyclerView, homedataCategories);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.browseByBrandsViewAll.setOnClickListener(mCallback11);
            this.mboundView10.setOnClickListener(mCallback13);
            this.mboundView11.setOnClickListener(mCallback14);
            this.mboundView12.setOnClickListener(mCallback15);
            this.mboundView22.setVisibility(((webkul.opencart.mobikul.BuildConfig.isMobikul) ? (android.view.View.GONE) : (android.view.View.VISIBLE)));
            this.mboundView23.setVisibility(((webkul.opencart.mobikul.BuildConfig.isMobikul) ? (android.view.View.GONE) : (android.view.View.VISIBLE)));
            this.mboundView25.setVisibility(((webkul.opencart.mobikul.BuildConfig.isMobikul) ? (android.view.View.GONE) : (android.view.View.VISIBLE)));
            this.mboundView26.setOnClickListener(mCallback18);
            this.notificationInfo.setOnClickListener(mCallback16);
            this.sellerProfile.setOnClickListener(mCallback17);
            this.sellerProfile.setVisibility(((webkul.opencart.mobikul.BuildConfig.isMobikul) ? (android.view.View.GONE) : (android.view.View.VISIBLE)));
            this.toTop.setOnClickListener(mCallback12);
        }
        executeBindingsOn(navigation);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {


                    handlers.vendorOftheMonth();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // homedata
                webkul.opencart.mobikul.model.getHomePage.HomeDataModel homedata = mHomedata;
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {




                    handlers.onClickNotificationInfo(callbackArg_0, homedata);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {


                    handlers.onClickQRReader();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {


                    handlers.instorePickUp();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickViewAll(callbackArg_0);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {


                    handlers.onClickScrollToTop();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickSellerProfile(callbackArg_0);
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {


                    handlers.onClickBecomeSeller();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): navigation
        flag 1 (0x2L): data
        flag 2 (0x3L): homedata
        flag 3 (0x4L): handlers
        flag 4 (0x5L): build
        flag 5 (0x6L): null
        flag 6 (0x7L): BuildConfig.isMobikul ? View.GONE : View.VISIBLE
        flag 7 (0x8L): BuildConfig.isMobikul ? View.GONE : View.VISIBLE
        flag 8 (0x9L): android.databinding.ViewDataBinding.safeUnbox(homedata.partnerApproveRequired) ? View.GONE : View.VISIBLE
        flag 9 (0xaL): android.databinding.ViewDataBinding.safeUnbox(homedata.partnerApproveRequired) ? View.GONE : View.VISIBLE
        flag 10 (0xbL): android.databinding.ViewDataBinding.safeUnbox(homedata.partnerApproveRequired) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): android.databinding.ViewDataBinding.safeUnbox(homedata.partnerApproveRequired) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): homedata.footerMenu.size() != 0 ? View.VISIBLE : View.GONE
        flag 13 (0xeL): homedata.footerMenu.size() != 0 ? View.VISIBLE : View.GONE
        flag 14 (0xfL): homedata.gdprStatus == 1 ? homedata.gdprNotificationStatus == 1 : false
        flag 15 (0x10L): homedata.gdprStatus == 1 ? homedata.gdprNotificationStatus == 1 : false
        flag 16 (0x11L): homedata.partner == 0 ? android.databinding.ViewDataBinding.safeUnbox(homedata.partnerApproveRequired) ? View.GONE : View.VISIBLE : View.GONE
        flag 17 (0x12L): homedata.partner == 0 ? android.databinding.ViewDataBinding.safeUnbox(homedata.partnerApproveRequired) ? View.GONE : View.VISIBLE : View.GONE
        flag 18 (0x13L): homedata.currencies.currencies.size() <= 1 ? View.GONE : View.VISIBLE
        flag 19 (0x14L): homedata.currencies.currencies.size() <= 1 ? View.GONE : View.VISIBLE
        flag 20 (0x15L): homedata.gdprStatus == 1 ? homedata.gdprNotificationStatus == 1 : false ? View.VISIBLE : View.GONE
        flag 21 (0x16L): homedata.gdprStatus == 1 ? homedata.gdprNotificationStatus == 1 : false ? View.VISIBLE : View.GONE
        flag 22 (0x17L): homedata.languages.languages.size() <= 1 ? View.GONE : View.VISIBLE
        flag 23 (0x18L): homedata.languages.languages.size() <= 1 ? View.GONE : View.VISIBLE
        flag 24 (0x19L): homedata.partner == 0 ? android.databinding.ViewDataBinding.safeUnbox(homedata.partnerApproveRequired) ? View.VISIBLE : View.GONE : View.GONE
        flag 25 (0x1aL): homedata.partner == 0 ? android.databinding.ViewDataBinding.safeUnbox(homedata.partnerApproveRequired) ? View.VISIBLE : View.GONE : View.GONE
    flag mapping end*/
    //end
}