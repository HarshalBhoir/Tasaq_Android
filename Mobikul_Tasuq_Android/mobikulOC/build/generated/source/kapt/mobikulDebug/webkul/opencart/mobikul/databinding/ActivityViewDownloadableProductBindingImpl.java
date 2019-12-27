package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityViewDownloadableProductBindingImpl extends ActivityViewDownloadableProductBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_product_scroll_view, 1);
        sViewsWithIds.put(R.id.view_product_downloadable_detail_layout, 2);
        sViewsWithIds.put(R.id.product_image_view, 3);
        sViewsWithIds.put(R.id.featured_product_hsv, 4);
        sViewsWithIds.put(R.id.smallImageBtnlayout, 5);
        sViewsWithIds.put(R.id.product_name, 6);
        sViewsWithIds.put(R.id.productRatinglayout, 7);
        sViewsWithIds.put(R.id.productRating, 8);
        sViewsWithIds.put(R.id.noOfReviewTV, 9);
        sViewsWithIds.put(R.id.product_availability, 10);
        sViewsWithIds.put(R.id.product_shortDescription, 11);
        sViewsWithIds.put(R.id.moveTOWishList, 12);
        sViewsWithIds.put(R.id.tierPricesLinearLayoutStyle, 13);
        sViewsWithIds.put(R.id.tierPricesLinearLayout, 14);
        sViewsWithIds.put(R.id.sold_by_layout, 15);
        sViewsWithIds.put(R.id.sold_by_container, 16);
        sViewsWithIds.put(R.id.sold_by_label, 17);
        sViewsWithIds.put(R.id.sold_by_title, 18);
        sViewsWithIds.put(R.id.sellerratingTV, 19);
        sViewsWithIds.put(R.id.averageRatingTitle, 20);
        sViewsWithIds.put(R.id.averageRating_label1, 21);
        sViewsWithIds.put(R.id.averageRating_rating1, 22);
        sViewsWithIds.put(R.id.averageRating_label2, 23);
        sViewsWithIds.put(R.id.averageRating_rating2, 24);
        sViewsWithIds.put(R.id.averageRating_label3, 25);
        sViewsWithIds.put(R.id.averageRating_rating3, 26);
        sViewsWithIds.put(R.id.contact_us, 27);
        sViewsWithIds.put(R.id.product_customOptions, 28);
        sViewsWithIds.put(R.id.product_customOptions_RequiredField, 29);
        sViewsWithIds.put(R.id.links_ll_outer, 30);
        sViewsWithIds.put(R.id.links_ll, 31);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityViewDownloadableProductBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 32, sIncludes, sViewsWithIds));
    }
    private ActivityViewDownloadableProductBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[25]
            , (android.widget.RatingBar) bindings[22]
            , (android.widget.RatingBar) bindings[24]
            , (android.widget.RatingBar) bindings[26]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[27]
            , (android.widget.HorizontalScrollView) bindings[4]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.LinearLayout) bindings[30]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[29]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.RatingBar) bindings[8]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[19]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.TextView) bindings[17]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.TextView) bindings[18]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.ScrollView) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}