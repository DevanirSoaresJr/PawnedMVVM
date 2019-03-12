package devanir.soaresjunior.pawnedmvvmdcsj.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Repo{

        @SerializedName("Name")
        @Expose
        private String name;
        @SerializedName("Title")
        @Expose
        private String title;
        @SerializedName("Domain")
        @Expose
        private String domain;
        @SerializedName("BreachDate")
        @Expose
        private String breachDate;
        @SerializedName("AddedDate")
        @Expose
        private String addedDate;
        @SerializedName("ModifiedDate")
        @Expose
        private String modifiedDate;
        @SerializedName("PwnCount")
        @Expose
        private Integer pwnCount;
        @SerializedName("Description")
        @Expose
        private String description;
        @SerializedName("LogoPath")
        @Expose
        private String logoPath;
        @SerializedName("DataClasses")
        @Expose
        private List<String> dataClasses = null;
        @SerializedName("IsVerified")
        @Expose
        private Boolean isVerified;
        @SerializedName("IsFabricated")
        @Expose
        private Boolean isFabricated;
        @SerializedName("IsSensitive")
        @Expose
        private Boolean isSensitive;
        @SerializedName("IsRetired")
        @Expose
        private Boolean isRetired;
        @SerializedName("IsSpamList")
        @Expose
        private Boolean isSpamList;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public String getBreachDate() {
            return breachDate;
        }

        public void setBreachDate(String breachDate) {
            this.breachDate = breachDate;
        }

        public String getAddedDate() {
            return addedDate;
        }

        public void setAddedDate(String addedDate) {
            this.addedDate = addedDate;
        }

        public String getModifiedDate() {
            return modifiedDate;
        }

        public void setModifiedDate(String modifiedDate) {
            this.modifiedDate = modifiedDate;
        }

        public Integer getPwnCount() {
            return pwnCount;
        }

        public void setPwnCount(Integer pwnCount) {
            this.pwnCount = pwnCount;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getLogoPath() {
            return logoPath;
        }

        public void setLogoPath(String logoPath) {
            this.logoPath = logoPath;
        }

        public List<String> getDataClasses() {
            return dataClasses;
        }

        public void setDataClasses(List<String> dataClasses) {
            this.dataClasses = dataClasses;
        }

        public Boolean getIsVerified() {
            return isVerified;
        }

        public void setIsVerified(Boolean isVerified) {
            this.isVerified = isVerified;
        }

        public Boolean getIsFabricated() {
            return isFabricated;
        }

        public void setIsFabricated(Boolean isFabricated) {
            this.isFabricated = isFabricated;
        }

        public Boolean getIsSensitive() {
            return isSensitive;
        }

        public void setIsSensitive(Boolean isSensitive) {
            this.isSensitive = isSensitive;
        }

        public Boolean getIsRetired() {
            return isRetired;
        }

        public void setIsRetired(Boolean isRetired) {
            this.isRetired = isRetired;
        }

        public Boolean getIsSpamList() {
            return isSpamList;
        }

        public void setIsSpamList(Boolean isSpamList) {
            this.isSpamList = isSpamList;
        }

}
