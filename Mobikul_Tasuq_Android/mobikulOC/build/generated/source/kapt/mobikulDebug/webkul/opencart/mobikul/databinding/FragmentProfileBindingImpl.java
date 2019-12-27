package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProfileBindingImpl extends FragmentProfileBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.profile_image, 33);
        sViewsWithIds.put(R.id.wishlist_dashboard, 34);
        sViewsWithIds.put(R.id.addressbook_dashboard, 35);
        sViewsWithIds.put(R.id.order_dashboard, 36);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.ScrollView mboundView1;
    @NonNull
    private final android.view.View mboundView14;
    @NonNull
    private final android.support.v7.widget.CardView mboundView15;
    @NonNull
    private final android.view.View mboundView17;
    @NonNull
    private final android.support.v7.widget.CardView mboundView18;
    @NonNull
    private final android.support.v7.widget.CardView mboundView2;
    @NonNull
    private final android.view.View mboundView20;
    @NonNull
    private final android.support.v7.widget.CardView mboundView21;
    @NonNull
    private final android.view.View mboundView23;
    @NonNull
    private final android.support.v7.widget.CardView mboundView24;
    @NonNull
    private final android.widget.LinearLayout mboundView27;
    @NonNull
    private final android.support.design.button.MaterialButton mboundView28;
    @NonNull
    private final android.support.v7.widget.CardView mboundView3;
    @NonNull
    private final android.support.design.button.MaterialButton mboundView32;
    @NonNull
    private final android.support.v7.widget.CardView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback124;
    @Nullable
    private final android.view.View.OnClickListener mCallback112;
    @Nullable
    private final android.view.View.OnClickListener mCallback108;
    @Nullable
    private final android.view.View.OnClickListener mCallback113;
    @Nullable
    private final android.view.View.OnClickListener mCallback125;
    @Nullable
    private final android.view.View.OnClickListener mCallback109;
    @Nullable
    private final android.view.View.OnClickListener mCallback118;
    @Nullable
    private final android.view.View.OnClickListener mCallback122;
    @Nullable
    private final android.view.View.OnClickListener mCallback110;
    @Nullable
    private final android.view.View.OnClickListener mCallback111;
    @Nullable
    private final android.view.View.OnClickListener mCallback123;
    @Nullable
    private final android.view.View.OnClickListener mCallback119;
    @Nullable
    private final android.view.View.OnClickListener mCallback128;
    @Nullable
    private final android.view.View.OnClickListener mCallback116;
    @Nullable
    private final android.view.View.OnClickListener mCallback120;
    @Nullable
    private final android.view.View.OnClickListener mCallback117;
    @Nullable
    private final android.view.View.OnClickListener mCallback121;
    @Nullable
    private final android.view.View.OnClickListener mCallback126;
    @Nullable
    private final android.view.View.OnClickListener mCallback114;
    @Nullable
    private final android.view.View.OnClickListener mCallback115;
    @Nullable
    private final android.view.View.OnClickListener mCallback127;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProfileBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 37, sIncludes, sViewsWithIds));
    }
    private FragmentProfileBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[35]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[7]
            , (android.support.design.button.MaterialButton) bindings[30]
            , (android.support.design.button.MaterialButton) bindings[31]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[36]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[19]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[33]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[25]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[34]
            );
        this.addProduct.setTag(null);
        this.changePassword.setTag(null);
        this.dashboard.setTag(null);
        this.downloadProduct.setTag(null);
        this.editAccout.setTag(null);
        this.facebookBtn.setTag(null);
        this.googleBtn.setTag(null);
        this.logout.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ScrollView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView14 = (android.view.View) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.support.v7.widget.CardView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView17 = (android.view.View) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView18 = (android.support.v7.widget.CardView) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView2 = (android.support.v7.widget.CardView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView20 = (android.view.View) bindings[20];
        this.mboundView20.setTag(null);
        this.mboundView21 = (android.support.v7.widget.CardView) bindings[21];
        this.mboundView21.setTag(null);
        this.mboundView23 = (android.view.View) bindings[23];
        this.mboundView23.setTag(null);
        this.mboundView24 = (android.support.v7.widget.CardView) bindings[24];
        this.mboundView24.setTag(null);
        this.mboundView27 = (android.widget.LinearLayout) bindings[27];
        this.mboundView27.setTag(null);
        this.mboundView28 = (android.support.design.button.MaterialButton) bindings[28];
        this.mboundView28.setTag(null);
        this.mboundView3 = (android.support.v7.widget.CardView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView32 = (android.support.design.button.MaterialButton) bindings[32];
        this.mboundView32.setTag(null);
        this.mboundView4 = (android.support.v7.widget.CardView) bindings[4];
        this.mboundView4.setTag(null);
        this.newsletter.setTag(null);
        this.notification.setTag(null);
        this.orderReturn.setTag(null);
        this.productList.setTag(null);
        this.rewardPoints.setTag(null);
        this.sellerDashboard.setTag(null);
        this.sellerOrder.setTag(null);
        this.socialLogin.setTag(null);
        this.transaction.setTag(null);
        setRootTag(root);
        // listeners
        mCallback124 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 17);
        mCallback112 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 5);
        mCallback108 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
        mCallback113 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 6);
        mCallback125 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 18);
        mCallback109 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 2);
        mCallback118 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 11);
        mCallback122 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 15);
        mCallback110 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 3);
        mCallback111 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 4);
        mCallback123 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 16);
        mCallback119 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 12);
        mCallback128 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 21);
        mCallback116 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 9);
        mCallback120 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 13);
        mCallback117 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 10);
        mCallback121 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 14);
        mCallback126 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 19);
        mCallback114 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 7);
        mCallback115 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 8);
        mCallback127 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 20);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.loginlistener.LoginChecker) variable);
        }
        else if (BR.handlers == variableId) {
            setHandlers((webkul.opencart.mobikul.handlers.MainActivityHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable webkul.opencart.mobikul.loginlistener.LoginChecker Data) {
        updateRegistration(0, Data);
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }
    public void setHandlers(@Nullable webkul.opencart.mobikul.handlers.MainActivityHandler Handlers) {
        this.mHandlers = Handlers;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.handlers);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeData((webkul.opencart.mobikul.loginlistener.LoginChecker) object, fieldId);
        }
        return false;
    }
    private boolean onChangeData(webkul.opencart.mobikul.loginlistener.LoginChecker Data, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.userLogin) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.login) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.seller) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        boolean dataLogin = false;
        int dataSellerProjectIsMobikulBooleanFalseViewVISIBLEViewGONE = 0;
        int dataUserLoginViewGONEViewVISIBLE = 0;
        boolean dataSellerProjectIsMobikulBooleanFalse = false;
        webkul.opencart.mobikul.loginlistener.LoginChecker data = mData;
        boolean dataUserLogin = false;
        boolean dataSeller = false;
        webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
        int dataUserLoginViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x20L) != 0) {

            if((dirtyFlags & 0x20L) != 0) {
                if(webkul.opencart.mobikul.BuildConfig.isDemo) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }
        }
        if ((dirtyFlags & 0x3dL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (data != null) {
                        // read data.login
                        dataLogin = data.isLogin();
                    }
            }
            if ((dirtyFlags & 0x25L) != 0) {

                    if (data != null) {
                        // read data.userLogin
                        dataUserLogin = data.isUserLogin();
                    }
                if((dirtyFlags & 0x25L) != 0) {
                    if(dataUserLogin) {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read data.userLogin ? View.GONE : View.VISIBLE
                    dataUserLoginViewGONEViewVISIBLE = ((dataUserLogin) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read data.userLogin ? View.VISIBLE : View.GONE
                    dataUserLoginViewVISIBLEViewGONE = ((dataUserLogin) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x29L) != 0) {

                    if (data != null) {
                        // read data.seller
                        dataSeller = data.isSeller();
                    }
                if((dirtyFlags & 0x29L) != 0) {
                    if(dataSeller) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read data.seller ? !project.isMobikul : false
                    dataSellerProjectIsMobikulBooleanFalse = ((dataSeller) ? (!webkul.opencart.mobikul.BuildConfig.isMobikul) : (false));
                if((dirtyFlags & 0x29L) != 0) {
                    if(dataSellerProjectIsMobikulBooleanFalse) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read data.seller ? !project.isMobikul : false ? View.VISIBLE : View.GONE
                    dataSellerProjectIsMobikulBooleanFalseViewVISIBLEViewGONE = ((dataSellerProjectIsMobikulBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.addProduct.setOnClickListener(mCallback120);
            this.changePassword.setOnClickListener(mCallback115);
            this.dashboard.setOnClickListener(mCallback112);
            this.downloadProduct.setOnClickListener(mCallback116);
            this.editAccout.setOnClickListener(mCallback113);
            this.facebookBtn.setOnClickListener(mCallback126);
            this.googleBtn.setOnClickListener(mCallback127);
            this.logout.setOnClickListener(mCallback124);
            this.mboundView2.setOnClickListener(mCallback108);
            this.mboundView28.setOnClickListener(mCallback125);
            this.mboundView3.setOnClickListener(mCallback109);
            this.mboundView32.setOnClickListener(mCallback128);
            this.mboundView4.setOnClickListener(mCallback110);
            this.newsletter.setOnClickListener(mCallback114);
            this.notification.setOnClickListener(mCallback111);
            this.orderReturn.setOnClickListener(mCallback119);
            this.productList.setOnClickListener(mCallback121);
            this.rewardPoints.setOnClickListener(mCallback117);
            this.sellerDashboard.setOnClickListener(mCallback122);
            this.sellerOrder.setOnClickListener(mCallback123);
            this.socialLogin.setVisibility(((webkul.opencart.mobikul.BuildConfig.isDemo) ? (android.view.View.VISIBLE) : (android.view.View.GONE)));
            this.transaction.setOnClickListener(mCallback118);
        }
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(dataUserLoginViewVISIBLEViewGONE);
            this.mboundView27.setVisibility(dataUserLoginViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            this.mboundView14.setVisibility(dataSellerProjectIsMobikulBooleanFalseViewVISIBLEViewGONE);
            this.mboundView15.setVisibility(dataSellerProjectIsMobikulBooleanFalseViewVISIBLEViewGONE);
            this.mboundView17.setVisibility(dataSellerProjectIsMobikulBooleanFalseViewVISIBLEViewGONE);
            this.mboundView18.setVisibility(dataSellerProjectIsMobikulBooleanFalseViewVISIBLEViewGONE);
            this.mboundView20.setVisibility(dataSellerProjectIsMobikulBooleanFalseViewVISIBLEViewGONE);
            this.mboundView21.setVisibility(dataSellerProjectIsMobikulBooleanFalseViewVISIBLEViewGONE);
            this.mboundView23.setVisibility(dataSellerProjectIsMobikulBooleanFalseViewVISIBLEViewGONE);
            this.mboundView24.setVisibility(dataSellerProjectIsMobikulBooleanFalseViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 17: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickLogout(callbackArg_0);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickDashBoard(callbackArg_0);
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



                    handlers.onClickWishlist(callbackArg_0);
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickEditAccountInformation(callbackArg_0);
                }
                break;
            }
            case 18: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickLogin(callbackArg_0);
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



                    handlers.onClickAddressBook(callbackArg_0);
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickTransaction(callbackArg_0);
                }
                break;
            }
            case 15: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickSellerDashboard(callbackArg_0);
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



                    handlers.onClickMyOrders(callbackArg_0);
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



                    handlers.onClickNotification(callbackArg_0);
                }
                break;
            }
            case 16: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickSellerOrder(callbackArg_0);
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickOrderReturn(callbackArg_0);
                }
                break;
            }
            case 21: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickSignUp(callbackArg_0);
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickDownloadProducts(callbackArg_0);
                }
                break;
            }
            case 13: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickAddProduct(callbackArg_0);
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickReward(callbackArg_0);
                }
                break;
            }
            case 14: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickProductList(callbackArg_0);
                }
                break;
            }
            case 19: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickFacebook(callbackArg_0);
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


                    handlers.onClickNewsLetter();
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



                    handlers.onClickChangePassword(callbackArg_0);
                }
                break;
            }
            case 20: {
                // localize variables for thread safety
                // handlers
                webkul.opencart.mobikul.handlers.MainActivityHandler handlers = mHandlers;
                // handlers != null
                boolean handlersJavaLangObjectNull = false;



                handlersJavaLangObjectNull = (handlers) != (null);
                if (handlersJavaLangObjectNull) {



                    handlers.onClickGmail(callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): handlers
        flag 2 (0x3L): data.userLogin
        flag 3 (0x4L): data.seller
        flag 4 (0x5L): data.login
        flag 5 (0x6L): null
        flag 6 (0x7L): data.seller ? !project.isMobikul : false ? View.VISIBLE : View.GONE
        flag 7 (0x8L): data.seller ? !project.isMobikul : false ? View.VISIBLE : View.GONE
        flag 8 (0x9L): data.userLogin ? View.GONE : View.VISIBLE
        flag 9 (0xaL): data.userLogin ? View.GONE : View.VISIBLE
        flag 10 (0xbL): data.seller ? !project.isMobikul : false
        flag 11 (0xcL): data.seller ? !project.isMobikul : false
        flag 12 (0xdL): project.isDemo ? View.VISIBLE : View.GONE
        flag 13 (0xeL): project.isDemo ? View.VISIBLE : View.GONE
        flag 14 (0xfL): data.userLogin ? View.VISIBLE : View.GONE
        flag 15 (0x10L): data.userLogin ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}