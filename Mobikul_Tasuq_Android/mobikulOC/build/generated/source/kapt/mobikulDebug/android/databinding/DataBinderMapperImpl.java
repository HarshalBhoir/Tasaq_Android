package android.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new webkul.opencart.mobikul.DataBinderMapperImpl());
  }
}
