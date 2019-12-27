package webkul.opencart.mobikul.databinding;
import webkul.opencart.mobikul.R;
import webkul.opencart.mobikul.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityViewSimpleProductBindingImpl extends ActivityViewSimpleProductBinding implements webkul.opencart.mobikul.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(91);
        sIncludes.setIncludes(13, 
            new String[] {"view_product_simple_option_layout"},
            new int[] {28},
            new int[] {R.layout.view_product_simple_option_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 27);
        sViewsWithIds.put(R.id.layoutContainer, 29);
        sViewsWithIds.put(R.id.add_to_cart_LL, 30);
        sViewsWithIds.put(R.id.view_product_scroll_view, 31);
        sViewsWithIds.put(R.id.view_product_simple_detail_layout, 32);
        sViewsWithIds.put(R.id.banner_image, 33);
        sViewsWithIds.put(R.id.pagerLayout, 34);
        sViewsWithIds.put(R.id.pager_layout, 35);
        sViewsWithIds.put(R.id.banner_pager, 36);
        sViewsWithIds.put(R.id.dot_group, 37);
        sViewsWithIds.put(R.id.arbtn, 38);
        sViewsWithIds.put(R.id.featured_product_hsv, 39);
        sViewsWithIds.put(R.id.smallImageBtnlayout, 40);
        sViewsWithIds.put(R.id.productRatinglayout, 41);
        sViewsWithIds.put(R.id.product_shortDescription, 42);
        sViewsWithIds.put(R.id.product_code, 43);
        sViewsWithIds.put(R.id.seller_details, 44);
        sViewsWithIds.put(R.id.seller_name, 45);
        sViewsWithIds.put(R.id.review_guest, 46);
        sViewsWithIds.put(R.id.add_your_review_txt, 47);
        sViewsWithIds.put(R.id.tierPricesLinearLayoutPrice, 48);
        sViewsWithIds.put(R.id.special_product_price_save, 49);
        sViewsWithIds.put(R.id.price_in_reward_points, 50);
        sViewsWithIds.put(R.id.noOfReviewTV, 51);
        sViewsWithIds.put(R.id.minimum_container, 52);
        sViewsWithIds.put(R.id.minimum_text, 53);
        sViewsWithIds.put(R.id.customOptionLLOuter, 54);
        sViewsWithIds.put(R.id.requiredFieldTV, 55);
        sViewsWithIds.put(R.id.customOptionLL, 56);
        sViewsWithIds.put(R.id.tierPricesLinearLayoutStyle, 57);
        sViewsWithIds.put(R.id.tierPricesLinearLayout, 58);
        sViewsWithIds.put(R.id.sold_by_layout, 59);
        sViewsWithIds.put(R.id.sold_by_container, 60);
        sViewsWithIds.put(R.id.sold_by_label, 61);
        sViewsWithIds.put(R.id.sold_by_title, 62);
        sViewsWithIds.put(R.id.sellerratingTV, 63);
        sViewsWithIds.put(R.id.averageRatingTitle, 64);
        sViewsWithIds.put(R.id.averageRating_label1, 65);
        sViewsWithIds.put(R.id.averageRating_rating1, 66);
        sViewsWithIds.put(R.id.averageRating_label2, 67);
        sViewsWithIds.put(R.id.averageRating_rating2, 68);
        sViewsWithIds.put(R.id.averageRating_label3, 69);
        sViewsWithIds.put(R.id.averageRating_rating3, 70);
        sViewsWithIds.put(R.id.contact_us, 71);
        sViewsWithIds.put(R.id.assignProductLayout, 72);
        sViewsWithIds.put(R.id.newAssignProduct, 73);
        sViewsWithIds.put(R.id.newProduct, 74);
        sViewsWithIds.put(R.id.newProductCount, 75);
        sViewsWithIds.put(R.id.usedAssignProduct, 76);
        sViewsWithIds.put(R.id.usedProduct, 77);
        sViewsWithIds.put(R.id.usedProductCount, 78);
        sViewsWithIds.put(R.id.assignSellerNewList, 79);
        sViewsWithIds.put(R.id.assignSellerUsedList, 80);
        sViewsWithIds.put(R.id.spaces, 81);
        sViewsWithIds.put(R.id.sellerInfo, 82);
        sViewsWithIds.put(R.id.description_layotu, 83);
        sViewsWithIds.put(R.id.feature_layout, 84);
        sViewsWithIds.put(R.id.review_container, 85);
        sViewsWithIds.put(R.id.review_tv, 86);
        sViewsWithIds.put(R.id.review_layout, 87);
        sViewsWithIds.put(R.id.related_product_tv, 88);
        sViewsWithIds.put(R.id.related_Product_ll, 89);
        sViewsWithIds.put(R.id.view_product_progress_bar, 90);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView13;
    @NonNull
    private final android.widget.TextView mboundView16;
    @NonNull
    private final android.widget.TextView mboundView19;
    @NonNull
    private final android.widget.TextView mboundView22;
    @NonNull
    private final android.widget.TextView mboundView26;
    @NonNull
    private final android.support.design.card.MaterialCardView mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback94;
    @Nullable
    private final android.view.View.OnClickListener mCallback95;
    @Nullable
    private final android.view.View.OnClickListener mCallback100;
    @Nullable
    private final android.view.View.OnClickListener mCallback101;
    @Nullable
    private final android.view.View.OnClickListener mCallback104;
    @Nullable
    private final android.view.View.OnClickListener mCallback99;
    @Nullable
    private final android.view.View.OnClickListener mCallback102;
    @Nullable
    private final android.view.View.OnClickListener mCallback96;
    @Nullable
    private final android.view.View.OnClickListener mCallback103;
    @Nullable
    private final android.view.View.OnClickListener mCallback98;
    @Nullable
    private final android.view.View.OnClickListener mCallback97;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityViewSimpleProductBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 91, sIncludes, sViewsWithIds));
    }
    private ActivityViewSimpleProductBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.LinearLayout) bindings[30]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[47]
            , (android.support.design.widget.AppBarLayout) bindings[1]
            , (android.widget.ImageView) bindings[38]
            , (android.widget.LinearLayout) bindings[72]
            , (android.widget.LinearLayout) bindings[79]
            , (android.widget.LinearLayout) bindings[80]
            , (android.widget.TextView) bindings[65]
            , (android.widget.TextView) bindings[67]
            , (android.widget.TextView) bindings[69]
            , (android.widget.RatingBar) bindings[66]
            , (android.widget.RatingBar) bindings[68]
            , (android.widget.RatingBar) bindings[70]
            , (android.widget.TextView) bindings[64]
            , (android.widget.RelativeLayout) bindings[33]
            , (android.support.v4.view.ViewPager) bindings[36]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[71]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[56]
            , (android.widget.LinearLayout) bindings[54]
            , (android.widget.LinearLayout) bindings[83]
            , (android.widget.TextView) bindings[24]
            , (android.widget.LinearLayout) bindings[37]
            , (android.widget.LinearLayout) bindings[84]
            , (android.widget.TextView) bindings[25]
            , (android.widget.HorizontalScrollView) bindings[39]
            , (android.widget.RelativeLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[52]
            , (android.widget.TextView) bindings[53]
            , (android.widget.LinearLayout) bindings[73]
            , (android.widget.TextView) bindings[74]
            , (android.widget.TextView) bindings[75]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[51]
            , (webkul.opencart.mobikul.databinding.ViewProductSimpleOptionLayoutBinding) bindings[28]
            , (android.widget.LinearLayout) bindings[34]
            , (android.widget.LinearLayout) bindings[35]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[50]
            , (android.widget.TextView) bindings[9]
            , (android.widget.LinearLayout) bindings[43]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[11]
            , (android.widget.RatingBar) bindings[12]
            , (android.widget.RatingBar) bindings[18]
            , (android.widget.LinearLayout) bindings[41]
            , (android.widget.TextView) bindings[42]
            , (android.widget.LinearLayout) bindings[89]
            , (android.widget.TextView) bindings[88]
            , (android.widget.TextView) bindings[55]
            , (android.widget.LinearLayout) bindings[85]
            , (android.widget.LinearLayout) bindings[46]
            , (android.widget.LinearLayout) bindings[87]
            , (android.widget.TextView) bindings[86]
            , (android.widget.TextView) bindings[17]
            , (android.widget.LinearLayout) bindings[44]
            , (android.widget.LinearLayout) bindings[82]
            , (android.widget.TextView) bindings[45]
            , (android.widget.TextView) bindings[63]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.LinearLayout) bindings[40]
            , (android.widget.LinearLayout) bindings[60]
            , (android.widget.TextView) bindings[61]
            , (android.widget.LinearLayout) bindings[59]
            , (android.widget.TextView) bindings[62]
            , (android.widget.LinearLayout) bindings[81]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[49]
            , (android.widget.TextView) bindings[20]
            , (android.widget.LinearLayout) bindings[58]
            , (android.widget.RelativeLayout) bindings[48]
            , (android.widget.LinearLayout) bindings[57]
            , (android.view.View) bindings[27]
            , (android.widget.LinearLayout) bindings[76]
            , (android.widget.TextView) bindings[77]
            , (android.widget.TextView) bindings[78]
            , (android.widget.ProgressBar) bindings[90]
            , (android.widget.ScrollView) bindings[31]
            , (android.widget.LinearLayout) bindings[32]
            , (android.widget.TextView) bindings[23]
            );
        this.addTocartButton.setTag(null);
        this.appbar.setTag(null);
        this.brand.setTag(null);
        this.buyNowButton.setTag(null);
        this.container.setTag(null);
        this.descriptionTv.setTag(null);
        this.featureTv.setTag(null);
        this.mboundView13 = (android.widget.LinearLayout) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView16 = (android.widget.TextView) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView19 = (android.widget.TextView) bindings[19];
        this.mboundView19.setTag(null);
        this.mboundView22 = (android.widget.TextView) bindings[22];
        this.mboundView22.setTag(null);
        this.mboundView26 = (android.widget.TextView) bindings[26];
        this.mboundView26.setTag(null);
        this.mboundView5 = (android.support.design.card.MaterialCardView) bindings[5];
        this.mboundView5.setTag(null);
        this.nextProduct.setTag(null);
        this.previousProduct.setTag(null);
        this.productAvailability.setTag(null);
        this.productImageView.setTag(null);
        this.productModel.setTag(null);
        this.productName.setTag(null);
        this.productPrice.setTag(null);
        this.productRating.setTag(null);
        this.productRating1.setTag(null);
        this.rewardPoints.setTag(null);
        this.shareProduct.setTag(null);
        this.specialProductPrice.setTag(null);
        this.tax.setTag(null);
        this.wishlistTv.setTag(null);
        setRootTag(root);
        // listeners
        mCallback94 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 1);
        mCallback95 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 2);
        mCallback100 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 7);
        mCallback101 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 8);
        mCallback104 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 11);
        mCallback99 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 6);
        mCallback102 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 9);
        mCallback96 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 3);
        mCallback103 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 10);
        mCallback98 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 5);
        mCallback97 = new webkul.opencart.mobikul.generated.callback.OnClickListener(this, 4);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        optionLayout.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (optionLayout.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.handler == variableId) {
            setHandler((webkul.opencart.mobikul.handlers.ViewProductSimpleHandler) variable);
        }
        else if (BR.data == variableId) {
            setData((webkul.opencart.mobikul.model.getProduct.ProductDetail) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable webkul.opencart.mobikul.handlers.ViewProductSimpleHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setData(@Nullable webkul.opencart.mobikul.model.getProduct.ProductDetail Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        optionLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeOptionLayout((webkul.opencart.mobikul.databinding.ViewProductSimpleOptionLayoutBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeOptionLayout(webkul.opencart.mobikul.databinding.ViewProductSimpleOptionLayoutBinding OptionLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.String dataReward = null;
        java.lang.String dataSpecial = null;
        java.lang.String dataStock = null;
        java.lang.String dataThumb = null;
        boolean validCheckIntDataRating = false;
        boolean validCheckSpecialDataSpecial = false;
        int validCheckForNullDataRewardViewVISIBLEViewGONE = 0;
        java.lang.String dataTax = null;
        java.lang.Boolean dataIsAr = null;
        boolean validCheckSpecialPriceDataSpecial = false;
        java.lang.String dataFormattedSpecial = null;
        int validCheckIntDataRatingViewVISIBLEViewGONE = 0;
        java.lang.String dataShowReview = null;
        java.lang.String dataModel = null;
        java.lang.String dataManufacturer = null;
        java.lang.String validCheckSpecialAtHomeDataSpecialDataFormattedSpecialDataPrice = null;
        java.lang.String dataPrice = null;
        int validCheckSpecialPriceDataSpecialViewVISIBLEViewGONE = 0;
        boolean validCheckForNullDataManufacturer = false;
        java.lang.String taxAndroidStringTaxDataTax = null;
        boolean androidDatabindingViewDataBindingSafeUnboxDataIsAr = false;
        java.lang.String rewardPointsAndroidStringRewardDataReward = null;
        webkul.opencart.mobikul.handlers.ViewProductSimpleHandler handler = mHandler;
        java.lang.String brandAndroidStringManufacturerDataManufacturer = null;
        java.lang.String dataName = null;
        int dataIsArViewVISIBLEViewGONE = 0;
        webkul.opencart.mobikul.model.getProduct.ProductDetail data = mData;
        int validCheckSpecialPriceDataSpecialProductPriceAndroidColorLightGrayProductPriceAndroidColorV3PriceColor = 0;
        int validCheckForNullDataManufacturerViewVISIBLEViewGONE = 0;
        int dataRating = 0;
        int validCheckSpecialDataSpecialViewVISIBLEViewVISIBLE = 0;
        boolean validCheckForNullDataReward = false;

        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xcL) != 0) {



                if (data != null) {
                    // read data.reward
                    dataReward = data.getReward();
                    // read data.special
                    dataSpecial = data.getSpecial();
                    // read data.stock
                    dataStock = data.getStock();
                    // read data.thumb
                    dataThumb = data.getThumb();
                    // read data.tax
                    dataTax = data.getTax();
                    // read data.isAr()
                    dataIsAr = data.isAr();
                    // read data.formattedSpecial
                    dataFormattedSpecial = data.getFormattedSpecial();
                    // read data.showReview()
                    dataShowReview = data.showReview();
                    // read data.model
                    dataModel = data.getModel();
                    // read data.manufacturer
                    dataManufacturer = data.getManufacturer();
                    // read data.price
                    dataPrice = data.getPrice();
                    // read data.name
                    dataName = data.getName();
                    // read data.rating
                    dataRating = data.getRating();
                }


                // read @android:string/reward
                rewardPointsAndroidStringRewardDataReward = rewardPoints.getResources().getString(R.string.reward, dataReward);
                // read valid.checkForNull(data.reward)
                validCheckForNullDataReward = webkul.opencart.mobikul.utils.Validation.checkForNull(dataReward);
                // read valid.checkSpecial(data.special)
                validCheckSpecialDataSpecial = webkul.opencart.mobikul.utils.Validation.checkSpecial(dataSpecial);
                // read valid.checkSpecialPrice(data.special)
                validCheckSpecialPriceDataSpecial = webkul.opencart.mobikul.utils.Validation.checkSpecialPrice(dataSpecial);
                // read @android:string/tax
                taxAndroidStringTaxDataTax = tax.getResources().getString(R.string.tax, dataTax);
                // read android.databinding.ViewDataBinding.safeUnbox(data.isAr())
                androidDatabindingViewDataBindingSafeUnboxDataIsAr = android.databinding.ViewDataBinding.safeUnbox(dataIsAr);
                // read valid.checkForNull(data.manufacturer)
                validCheckForNullDataManufacturer = webkul.opencart.mobikul.utils.Validation.checkForNull(dataManufacturer);
                // read @android:string/manufacturer
                brandAndroidStringManufacturerDataManufacturer = brand.getResources().getString(R.string.manufacturer, dataManufacturer);
                // read valid.checkSpecialAtHome(data.special, data.formattedSpecial, data.price)
                validCheckSpecialAtHomeDataSpecialDataFormattedSpecialDataPrice = webkul.opencart.mobikul.utils.Validation.checkSpecialAtHome(dataSpecial, dataFormattedSpecial, dataPrice);
                // read valid.checkInt(data.rating)
                validCheckIntDataRating = webkul.opencart.mobikul.utils.Validation.checkInt(dataRating);
            if((dirtyFlags & 0xcL) != 0) {
                if(validCheckForNullDataReward) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(validCheckSpecialDataSpecial) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(validCheckSpecialPriceDataSpecial) {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x1000L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(androidDatabindingViewDataBindingSafeUnboxDataIsAr) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(validCheckForNullDataManufacturer) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(validCheckIntDataRating) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read valid.checkForNull(data.reward) ? View.VISIBLE : View.GONE
                validCheckForNullDataRewardViewVISIBLEViewGONE = ((validCheckForNullDataReward) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read valid.checkSpecial(data.special) ? View.VISIBLE : View.VISIBLE
                validCheckSpecialDataSpecialViewVISIBLEViewVISIBLE = ((validCheckSpecialDataSpecial) ? (android.view.View.VISIBLE) : (android.view.View.VISIBLE));
                // read valid.checkSpecialPrice(data.special) ? View.VISIBLE : View.GONE
                validCheckSpecialPriceDataSpecialViewVISIBLEViewGONE = ((validCheckSpecialPriceDataSpecial) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read valid.checkSpecialPrice(data.special) ? @android:color/light_gray : @android:color/v3_price_color
                validCheckSpecialPriceDataSpecialProductPriceAndroidColorLightGrayProductPriceAndroidColorV3PriceColor = ((validCheckSpecialPriceDataSpecial) ? (getColorFromResource(productPrice, R.color.light_gray)) : (getColorFromResource(productPrice, R.color.v3_price_color)));
                // read android.databinding.ViewDataBinding.safeUnbox(data.isAr()) ? View.VISIBLE : View.GONE
                dataIsArViewVISIBLEViewGONE = ((androidDatabindingViewDataBindingSafeUnboxDataIsAr) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read valid.checkForNull(data.manufacturer) ? View.VISIBLE : View.GONE
                validCheckForNullDataManufacturerViewVISIBLEViewGONE = ((validCheckForNullDataManufacturer) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read valid.checkInt(data.rating) ? View.VISIBLE : View.GONE
                validCheckIntDataRatingViewVISIBLEViewGONE = ((validCheckIntDataRating) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.addTocartButton.setOnClickListener(mCallback94);
            this.buyNowButton.setOnClickListener(mCallback95);
            this.descriptionTv.setOnClickListener(mCallback102);
            this.featureTv.setOnClickListener(mCallback103);
            this.mboundView22.setOnClickListener(mCallback100);
            this.mboundView26.setOnClickListener(mCallback104);
            this.mboundView5.setOnClickListener(mCallback96);
            this.nextProduct.setOnClickListener(mCallback98);
            this.previousProduct.setOnClickListener(mCallback97);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.productModel, productModel.getResources().getString(R.string.model));
            this.shareProduct.setOnClickListener(mCallback99);
            this.wishlistTv.setOnClickListener(mCallback101);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.brand, brandAndroidStringManufacturerDataManufacturer);
            this.brand.setVisibility(validCheckForNullDataManufacturerViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView16, dataModel);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView19, dataShowReview);
            this.mboundView19.setVisibility(validCheckIntDataRatingViewVISIBLEViewGONE);
            this.mboundView5.setVisibility(dataIsArViewVISIBLEViewGONE);
            this.optionLayout.setData(data);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.productAvailability, dataStock);
            webkul.opencart.mobikul.utils.ImageLoader.loadImage(this.productImageView, dataThumb, (java.lang.String)null);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.productName, dataName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.productPrice, dataPrice);
            this.productPrice.setTextColor(validCheckSpecialPriceDataSpecialProductPriceAndroidColorLightGrayProductPriceAndroidColorV3PriceColor);
            this.productPrice.setVisibility(validCheckSpecialDataSpecialViewVISIBLEViewVISIBLE);
            android.databinding.adapters.RatingBarBindingAdapter.setRating(this.productRating, dataRating);
            this.productRating.setVisibility(validCheckIntDataRatingViewVISIBLEViewGONE);
            android.databinding.adapters.RatingBarBindingAdapter.setRating(this.productRating1, dataRating);
            this.productRating1.setVisibility(validCheckIntDataRatingViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.rewardPoints, rewardPointsAndroidStringRewardDataReward);
            this.rewardPoints.setVisibility(validCheckForNullDataRewardViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.specialProductPrice, validCheckSpecialAtHomeDataSpecialDataFormattedSpecialDataPrice);
            this.specialProductPrice.setVisibility(validCheckSpecialPriceDataSpecialViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tax, taxAndroidStringTaxDataTax);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.optionLayout.setHandler(handler);
        }
        executeBindingsOn(optionLayout);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.ViewProductSimpleHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.model.getProduct.ProductDetail data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickAddToCart(callbackArg_0, data);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.ViewProductSimpleHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.model.getProduct.ProductDetail data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickBuyNow(callbackArg_0, data);
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.ViewProductSimpleHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.model.getProduct.ProductDetail data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickshareProduct(callbackArg_0, data);
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.ViewProductSimpleHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.model.getProduct.ProductDetail data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickAddToWishlist(callbackArg_0, data);
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.ViewProductSimpleHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.model.getProduct.ProductDetail data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onClickReview(data);
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.ViewProductSimpleHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.model.getProduct.ProductDetail data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickshareProduct(callbackArg_0, data);
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.ViewProductSimpleHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.model.getProduct.ProductDetail data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickDetail(callbackArg_0, data);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.ViewProductSimpleHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.model.getProduct.ProductDetail data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onClickArBtn(data);
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.ViewProductSimpleHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.model.getProduct.ProductDetail data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickFeature(callbackArg_0, data);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.ViewProductSimpleHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.model.getProduct.ProductDetail data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickNext(callbackArg_0, data);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handler
                webkul.opencart.mobikul.handlers.ViewProductSimpleHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // data
                webkul.opencart.mobikul.model.getProduct.ProductDetail data = mData;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {




                    handler.onClickPrevious(callbackArg_0, data);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): optionLayout
        flag 1 (0x2L): handler
        flag 2 (0x3L): data
        flag 3 (0x4L): null
        flag 4 (0x5L): valid.checkForNull(data.reward) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): valid.checkForNull(data.reward) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): valid.checkInt(data.rating) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): valid.checkInt(data.rating) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): valid.checkSpecialPrice(data.special) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): valid.checkSpecialPrice(data.special) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): android.databinding.ViewDataBinding.safeUnbox(data.isAr()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): android.databinding.ViewDataBinding.safeUnbox(data.isAr()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): valid.checkSpecialPrice(data.special) ? @android:color/light_gray : @android:color/v3_price_color
        flag 13 (0xeL): valid.checkSpecialPrice(data.special) ? @android:color/light_gray : @android:color/v3_price_color
        flag 14 (0xfL): valid.checkForNull(data.manufacturer) ? View.VISIBLE : View.GONE
        flag 15 (0x10L): valid.checkForNull(data.manufacturer) ? View.VISIBLE : View.GONE
        flag 16 (0x11L): valid.checkSpecial(data.special) ? View.VISIBLE : View.VISIBLE
        flag 17 (0x12L): valid.checkSpecial(data.special) ? View.VISIBLE : View.VISIBLE
    flag mapping end*/
    //end
}