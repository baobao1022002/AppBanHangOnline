package vn.name.appbanhang.retrofit;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import vn.name.appbanhang.model.LoaiSpModel;

public interface ApiBanHang {
    @GET("getloaisp.php")
    Observable<LoaiSpModel> getLoaiSp();
}
