package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.TextView;

public abstract class TableRowLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView tableData1;

  @NonNull
  public final TextView tableData2;

  @NonNull
  public final TextView tableData3;

  @NonNull
  public final TableRow tableRowHeadingLayout;

  protected TableRowLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView tableData1, TextView tableData2, TextView tableData3,
      TableRow tableRowHeadingLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tableData1 = tableData1;
    this.tableData2 = tableData2;
    this.tableData3 = tableData3;
    this.tableRowHeadingLayout = tableRowHeadingLayout;
  }

  @NonNull
  public static TableRowLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static TableRowLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<TableRowLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.table_row_layout, root, attachToRoot, component);
  }

  @NonNull
  public static TableRowLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static TableRowLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<TableRowLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.table_row_layout, null, false, component);
  }

  public static TableRowLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static TableRowLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (TableRowLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.table_row_layout);
  }
}
