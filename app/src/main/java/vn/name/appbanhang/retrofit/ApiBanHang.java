package vn.name.appbanhang.retrofit;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import vn.name.appbanhang.model.LoaiSpModel;
import vn.name.appbanhang.model.SanPhamMoiModel;

public interface ApiBanHang {
    @GET("getloaisp.php")
    Observable<LoaiSpModel> getLoaiSp();

    @GET("getspmoi.php")
    Observable<SanPhamMoiModel> getSpMoi();

   @POST("chitiet.php")
   @FormUrlEncoded
   Observable<SanPhamMoiModel> getSanPham(
          @Field("page") int page,
          @Field("loai") int loai
   );
}
