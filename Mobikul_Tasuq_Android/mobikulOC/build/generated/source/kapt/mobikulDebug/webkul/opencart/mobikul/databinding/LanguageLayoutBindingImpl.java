package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LanguageLayoutBindingImpl extends LanguageLayoutBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LanguageLayoutBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private LanguageLayoutBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.LinearLayout) bindings[1]
            );
        this.categoryName.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.rightNavLl.setTag(null);
        setRootTag(root);
        // listeners
        mCallback20 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setHandler((webkul.opencart.mobikul.handlers.LanguageHandler) variable);
        }
        else if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.adapterModel.LanguageAdapterModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable webkul.opencart.mobikul.handlers.LanguageHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setData(@Nullable webkul.opencart.mobikul.adapterModel.LanguageAdapterModel Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.data);
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
        int validCheckCodeDataSelectCodeDataCodeMboundView2AndroidColorAccentColorMboundView2AndroidColorGray = 0;
        java.lang.String dataCode = null;
        webkul.opencart.mobikul.handlers.LanguageHandler handler = mHandler;
        java.lang.String dataSelectCode = null;
        java.lang.String dataName = null;
        java.lang.String dataLanguageTitle = null;
        webkul.opencart.mobikul.adapterModel.LanguageAdapterModel data = mData;
        int validCheckCodeDataSelectCodeDataCodeCategoryNameAndroidColorAccentColorCategoryNameAndroidColorGray = 0;
        boolean validCheckCodeDataSelectCodeDataCode = false;

        if ((dirtyFlags & 0x6L) != 0) {



                if (data != null) {
                    // read data.code
                    dataCode = data.getCode();
                    // read data.selectCode
                    dataSelectCode = data.getSelectCode();
                    // read data.name
                    dataName = data.getName();
                    // read data.languageTitle
                    dataLanguageTitle = data.getLanguageTitle();
                }


                // read valid.checkCode(data.selectCode, data.code)
                validCheckCodeDataSelectCodeDataCode = webkul.opencart.mobikul.utils.Validation.checkCode(dataSelectCode, dataCode);
            if((dirtyFlags & 0x6L) != 0) {
                if(validCheckCodeDataSelectCodeDataCode) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read valid.checkCode(data.selectCode, data.code) ? @android:color/accent_color : @android:color/gray
                validCheckCodeDataSelectCodeDataCodeMboundView2AndroidColorAccentColorMboundView2AndroidColorGray = ((validCheckCodeDataSelectCodeDataCode) ? (getColorFromResource(mboundView2, R.color.accent_color)) : (getColorFromResource(mboundView2, R.color.gray)));
                // read valid.checkCode(data.selectCode, data.code) ? @android:color/accent_color : @android:color/gray
                validCheckCodeDataSelectCodeDataCodeCategoryNameAndroidColorAccentColorCategoryNameAndroidColorGray = ((validCheckCodeDataSelectCodeDataCode) ? (getColorFromResource(categoryName, R.color.accent_color)) : (getColorFromResource(categoryName, R.color.gray)));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.categoryName, dataName);
            this.categoryName.setTextColor(validCheckCodeDataSelectCodeDataCodeCategoryNameAndroidColorAccentColorCategoryNameAndroidColorGray);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, dataLanguageTitle);
            this.mboundView2.setTextColor(validCheckCodeDataSelectCodeDataCodeMboundView2AndroidColorAccentColorMboundView2AndroidColorGray);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.rightNavLl.setOnClickListener(mCallback20);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // handler
        webkul.opencart.mobikul.handlers.LanguageHandler handler = mHandler;
        // handler != null
        boolean handlerJavaLangObjectNull = false;
        // data
        webkul.opencart.mobikul.adapterModel.LanguageAdapterModel data = mData;



        handlerJavaLangObjectNull = (handler) != (null);
        if (handlerJavaLangObjectNull) {




            handler.onClickCategory(callbackArg_0, data);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): handler
        flag 1 (0x2L): data
        flag 2 (0x3L): null
        flag 3 (0x4L): valid.checkCode(data.selectCode, data.code) ? @android:color/accent_color : @android:color/gray
        flag 4 (0x5L): valid.checkCode(data.selectCode, data.code) ? @android:color/accent_color : @android:color/gray
        flag 5 (0x6L): valid.checkCode(data.selectCode, data.code) ? @android:color/accent_color : @android:color/gray
        flag 6 (0x7L): valid.checkCode(data.selectCode, data.code) ? @android:color/accent_color : @android:color/gray
    flag mapping end*/
    //end
}