package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import webkul.opencart.mobikul.CategoryName;

public abstract class SearchChildItemBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView childList;

  @NonNull
  public final TextView itemFirst;

  @NonNull
  public final LinearLayout llParent;

  @NonNull
  public final TextView textLebel;

  @Bindable
  protected CategoryName mData;

  protected SearchChildItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RecyclerView childList, TextView itemFirst, LinearLayout llParent,
      TextView textLebel) {
    super(_bindingComponent, _root, _localFieldCount);
    this.childList = childList;
    this.itemFirst = itemFirst;
    this.llParent = llParent;
    this.textLebel = textLebel;
  }

  public abstract void setData(@Nullable CategoryName data);

  @Nullable
  public CategoryName getData() {
    return mData;
  }

  @NonNull
  public static SearchChildItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchChildItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchChildItemBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.search_child_item, root, attachToRoot, component);
  }

  @NonNull
  public static SearchChildItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchChildItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchChildItemBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.search_child_item, null, false, component);
  }

  public static SearchChildItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SearchChildItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SearchChildItemBinding)bind(component, view, webkul.opencart.mobikul.R.layout.search_child_item);
  }
}
