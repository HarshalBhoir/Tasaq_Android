package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class GridhomeBindingImpl extends GridhomeBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.relative, 4);
        sViewsWithIds.put(R.id.productImageLayout, 5);
        sViewsWithIds.put(R.id.outOfStock, 6);
        sViewsWithIds.put(R.id.sale, 7);
        sViewsWithIds.put(R.id.trans, 8);
        sViewsWithIds.put(R.id.wishlist, 9);
        sViewsWithIds.put(R.id.addToCart, 10);
        sViewsWithIds.put(R.id.productInfoLayout, 11);
        sViewsWithIds.put(R.id.productInfoLayoutInner, 12);
        sViewsWithIds.put(R.id.sellerStringTV, 13);
        sViewsWithIds.put(R.id.ratingBar, 14);
        sViewsWithIds.put(R.id.model, 15);
        sViewsWithIds.put(R.id.productInfoLayoutPrice, 16);
        sViewsWithIds.put(R.id.newPrice, 17);
        sViewsWithIds.put(R.id.btnLayout, 18);
        sViewsWithIds.put(R.id.addToCartPop, 19);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public GridhomeBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private GridhomeBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.LinearLayout) bindings[18]
            , (android.support.v7.widget.CardView) bindings[0]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.RelativeLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.TextView) bindings[2]
            , (android.widget.RatingBar) bindings[14]
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[13]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.ImageView) bindings[9]
            );
        this.cardViewNewsletter.setTag(null);
        this.price.setTag(null);
        this.productImage.setTag(null);
        this.productName.setTag(null);
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
            setData((webkul.opencart.mobikul.adapterModel.HomePageAdapteModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable webkul.opencart.mobikul.adapterModel.HomePageAdapteModel Data) {
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
        java.lang.String dataProduct = null;
        java.lang.String dataImageUrl = null;
        webkul.opencart.mobikul.adapterModel.HomePageAdapteModel data = mData;
        java.lang.String dataPrice = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (data != null) {
                    // read data.product
                    dataProduct = data.getProduct();
                    // read data.ImageUrl
                    dataImageUrl = data.getImageUrl();
                    // read data.price
                    dataPrice = data.getPrice();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.price, dataPrice);
            webkul.opencart.mobikul.utils.ImageLoader.loadImage(this.productImage, dataImageUrl, (java.lang.String)null);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.productName, dataProduct);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}