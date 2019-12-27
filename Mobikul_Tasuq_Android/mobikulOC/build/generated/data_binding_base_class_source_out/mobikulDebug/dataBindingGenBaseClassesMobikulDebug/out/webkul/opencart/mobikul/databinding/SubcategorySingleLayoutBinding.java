package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import de.hdodenhof.circleimageview.CircleImageView;
import webkul.opencart.mobikul.adapterModel.RightNavAdapterModel;
import webkul.opencart.mobikul.handlers.LeftNavHandlers;

public abstract class SubcategorySingleLayoutBinding extends ViewDataBinding {
  @NonNull
  public final CircleImageView subCategoryImage;

  @NonNull
  public final LinearLayout subcategoryLayout;

  @NonNull
  public final TextView subcategoryTxt;

  @Bindable
  protected RightNavAdapterModel mData;

  @Bindable
  protected LeftNavHandlers mHandler;

  protected SubcategorySingleLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, CircleImageView subCategoryImage, LinearLayout subcategoryLayout,
      TextView subcategoryTxt) {
    super(_bindingComponent, _root, _localFieldCount);
    this.subCategoryImage = subCategoryImage;
    this.subcategoryLayout = subcategoryLayout;
    this.subcategoryTxt = subcategoryTxt;
  }

  public abstract void setData(@Nullable RightNavAdapterModel data);

  @Nullable
  public RightNavAdapterModel getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable LeftNavHandlers handler);

  @Nullable
  public LeftNavHandlers getHandler() {
    return mHandler;
  }

  @NonNull
  public static SubcategorySingleLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SubcategorySingleLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SubcategorySingleLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.subcategory_single_layout, root, attachToRoot, component);
  }

  @NonNull
  public static SubcategorySingleLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SubcategorySingleLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SubcategorySingleLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.subcategory_single_layout, null, false, component);
  }

  public static SubcategorySingleLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SubcategorySingleLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SubcategorySingleLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.subcategory_single_layout);
  }
}
