package TesterCart;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class TestersCart {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("badges")
    @Expose
    private Badges badges;
    @SerializedName("checkItemStates")
    @Expose
    private List<Object> checkItemStates;
    @SerializedName("closed")
    @Expose
    private Boolean closed;
    @SerializedName("dueComplete")
    @Expose
    private Boolean dueComplete;
    @SerializedName("dateLastActivity")
    @Expose
    private String dateLastActivity;
    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("descData")
    @Expose
    private DescData descData;
    @SerializedName("due")
    @Expose
    private Object due;
    @SerializedName("dueReminder")
    @Expose
    private Object dueReminder;
    @SerializedName("email")
    @Expose
    private Object email;
    @SerializedName("idBoard")
    @Expose
    private String idBoard;
    @SerializedName("idChecklists")
    @Expose
    private List<Object> idChecklists;
    @SerializedName("idList")
    @Expose
    private String idList;
    @SerializedName("idMembers")
    @Expose
    private List<Object> idMembers;
    @SerializedName("idMembersVoted")
    @Expose
    private List<Object> idMembersVoted;
    @SerializedName("idShort")
    @Expose
    private Integer idShort;
    @SerializedName("idAttachmentCover")
    @Expose
    private Object idAttachmentCover;
    @SerializedName("labels")
    @Expose
    private List<Object> labels;
    @SerializedName("idLabels")
    @Expose
    private List<Object> idLabels;
    @SerializedName("manualCoverAttachment")
    @Expose
    private Boolean manualCoverAttachment;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("pos")
    @Expose
    private Integer pos;
    @SerializedName("shortLink")
    @Expose
    private String shortLink;
    @SerializedName("shortUrl")
    @Expose
    private String shortUrl;
    @SerializedName("start")
    @Expose
    private Object start;
    @SerializedName("subscribed")
    @Expose
    private Boolean subscribed;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("cover")
    @Expose
    private Cover cover;
    @SerializedName("isTemplate")
    @Expose
    private Boolean isTemplate;
    @SerializedName("cardRole")
    @Expose
    private Object cardRole;
    @SerializedName("attachments")
    @Expose
    private List<Object> attachments;
    @SerializedName("stickers")
    @Expose
    private List<Object> stickers;
    @SerializedName("limits")
    @Expose
    private Limits limits;
}
