package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HomeProductCarousalBindingImpl extends HomeProductCarousalBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_all, 3);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HomeProductCarousalBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private HomeProductCarousalBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[0]
            , (android.support.v7.widget.RecyclerView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.llMain.setTag(null);
        this.productList.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.model.getHomePage.Modules) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable webkul.opencart.mobikul.model.getHomePage.Modules Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
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
        java.util.ArrayList<webkul.opencart.mobikul.model.getHomePage.Featured> dataProductList = null;
        int dataProductListSize = 0;
        boolean dataProductListSizeInt0 = false;
        java.lang.String dataName = null;
        webkul.opencart.mobikul.model.getHomePage.Modules data = mData;
        int dataProductListSizeInt0ViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (data != null) {
                    // read data.productList
                    dataProductList = data.getProductList();
                    // read data.name
                    dataName = data.getName();
                }


                if (dataProductList != null) {
                    // read data.productList.size()
                    dataProductListSize = dataProductList.size();
                }


                // read data.productList.size() > 0
                dataProductListSizeInt0 = (dataProductListSize) > (0);
            if((dirtyFlags & 0x3L) != 0) {
                if(dataProductListSizeInt0) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read data.productList.size() > 0 ? View.VISIBLE : View.GONE
                dataProductListSizeInt0ViewVISIBLEViewGONE = ((dataProductListSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.llMain.setVisibility(dataProductListSizeInt0ViewVISIBLEViewGONE);
            webkul.opencart.mobikul.utils.HomePageLayoutBinder.bindHomeView(this.productList, dataProductList);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, dataName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): null
        flag 2 (0x3L): data.productList.size() > 0 ? View.VISIBLE : View.GONE
        flag 3 (0x4L): data.productList.size() > 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}