package vn.manager.appbanhang.utils;

import java.util.ArrayList;
import java.util.List;

import vn.manager.appbanhang.model.GioHang;
import vn.manager.appbanhang.model.User;

public class Utils {
    public static final String BASE_URL="http://192.168.110.152/banhang/";
    public static List<GioHang> manggiohang;
    public static List<GioHang> mangmuahang = new ArrayList<>();
    public static User user_current = new User();
}
