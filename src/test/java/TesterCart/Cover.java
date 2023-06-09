package TesterCart;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cover {
    @SerializedName("idAttachment")
    @Expose
    private Object idAttachment;
    @SerializedName("color")
    @Expose
    private Object color;
    @SerializedName("idUploadedBackground")
    @Expose
    private Object idUploadedBackground;
    @SerializedName("size")
    @Expose
    private String size;
    @SerializedName("brightness")
    @Expose
    private String brightness;
    @SerializedName("idPlugin")
    @Expose
    private Object idPlugin;

}
