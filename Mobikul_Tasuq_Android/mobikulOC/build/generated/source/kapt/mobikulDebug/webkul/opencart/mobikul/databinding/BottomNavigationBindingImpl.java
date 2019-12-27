package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomNavigationBindingImpl extends BottomNavigationBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bottom_layout, 5);
        sViewsWithIds.put(R.id.bottom_home, 6);
        sViewsWithIds.put(R.id.bottom_home_tv, 7);
        sViewsWithIds.put(R.id.bottom_category, 8);
        sViewsWithIds.put(R.id.bottom_category_tv, 9);
        sViewsWithIds.put(R.id.bottom_notification, 10);
        sViewsWithIds.put(R.id.bottom_notification_tv, 11);
        sViewsWithIds.put(R.id.bottom_account, 12);
        sViewsWithIds.put(R.id.bottom_profile_tv, 13);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback59;
    @Nullable
    private final android.view.View.OnClickListener mCallback60;
    @Nullable
    private final android.view.View.OnClickListener mCallback58;
    @Nullable
    private final android.view.View.OnClickListener mCallback61;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomNavigationBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private BottomNavigationBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[13]
            , (android.support.v7.widget.LinearLayoutCompat) bindings[2]
            , (android.support.v7.widget.LinearLayoutCompat) bindings[1]
            , (android.support.v7.widget.LinearLayoutCompat) bindings[3]
            , (android.support.v7.widget.LinearLayoutCompat) bindings[4]
            );
        this.categoryLl.setTag(null);
        this.homeLl.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.notificationLl.setTag(null);
        this.profileLl.setTag(null);
        setRootTag(root);
        // listeners
        mCallback59 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 2);
        mCallback60 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 3);
        mCallback58 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
        mCallback61 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 4);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.handler == variableId) {
            setHandler((webkul.opencart.mobikul.handlers.BottomNavigationHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable webkul.opencart.mobikul.handlers.BottomNavigationHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        webkul.opencart.mobikul.handlers.BottomNavigationHandler handler = mHandler;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.categoryLl.setOnClickListener(mCallback59);
            this.homeLl.setOnClickListener(mCallback58);
            this.notificationLl.setOnClickListener(mCallback60);
            this.profileLl.setOnClickListener(mCallback61);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.BottomNavigationHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onClickCategory(callbackArg_0);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.BottomNavigationHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onClickNotification(callbackArg_0);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.BottomNavigationHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onClickHome(callbackArg_0);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.BottomNavigationHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onClickAccount(callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): handler
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}