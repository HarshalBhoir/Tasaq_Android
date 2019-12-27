package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class SorterBotttomSheetBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView sortList;

  protected SorterBotttomSheetBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RecyclerView sortList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.sortList = sortList;
  }

  @NonNull
  public static SorterBotttomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SorterBotttomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SorterBotttomSheetBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.sorter_botttom_sheet, root, attachToRoot, component);
  }

  @NonNull
  public static SorterBotttomSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SorterBotttomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SorterBotttomSheetBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.sorter_botttom_sheet, null, false, component);
  }

  public static SorterBotttomSheetBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SorterBotttomSheetBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SorterBotttomSheetBinding)bind(component, view, webkul.opencart.mobikul.R.layout.sorter_botttom_sheet);
  }
}
