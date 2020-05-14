
public class itrip_user {
       //主键
       private BIGINT id;
       //若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号
       private VARCHAR userCode;
       //若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
       private VARCHAR userPassword;
       //用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）
       private INT userType;
       //平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）
       private BIGINT flatID;
       //用户昵称
       private VARCHAR userName;
       //微信号
       private VARCHAR weChat;
       //qq账号
       private VARCHAR QQ;
       //微博账号
       private VARCHAR weibo;
       //百度账号
       private VARCHAR baidu;
       //
       private DATETIME creationDate;
       //
       private BIGINT createdBy;
       //
       private DATETIME modifyDate;
       //
       private BIGINT modifiedBy;
       //是否激活,(0 false，1 true,默认是0)
       private INT activated;
        public BIGINT getid() {
            return id;
        }
        public void setid(BIGINT id) {
            this.id = id;
        }
        public VARCHAR getuserCode() {
            return userCode;
        }
        public void setuserCode(VARCHAR userCode) {
            this.userCode = userCode;
        }
        public VARCHAR getuserPassword() {
            return userPassword;
        }
        public void setuserPassword(VARCHAR userPassword) {
            this.userPassword = userPassword;
        }
        public INT getuserType() {
            return userType;
        }
        public void setuserType(INT userType) {
            this.userType = userType;
        }
        public BIGINT getflatID() {
            return flatID;
        }
        public void setflatID(BIGINT flatID) {
            this.flatID = flatID;
        }
        public VARCHAR getuserName() {
            return userName;
        }
        public void setuserName(VARCHAR userName) {
            this.userName = userName;
        }
        public VARCHAR getweChat() {
            return weChat;
        }
        public void setweChat(VARCHAR weChat) {
            this.weChat = weChat;
        }
        public VARCHAR getQQ() {
            return QQ;
        }
        public void setQQ(VARCHAR QQ) {
            this.QQ = QQ;
        }
        public VARCHAR getweibo() {
            return weibo;
        }
        public void setweibo(VARCHAR weibo) {
            this.weibo = weibo;
        }
        public VARCHAR getbaidu() {
            return baidu;
        }
        public void setbaidu(VARCHAR baidu) {
            this.baidu = baidu;
        }
        public DATETIME getcreationDate() {
            return creationDate;
        }
        public void setcreationDate(DATETIME creationDate) {
            this.creationDate = creationDate;
        }
        public BIGINT getcreatedBy() {
            return createdBy;
        }
        public void setcreatedBy(BIGINT createdBy) {
            this.createdBy = createdBy;
        }
        public DATETIME getmodifyDate() {
            return modifyDate;
        }
        public void setmodifyDate(DATETIME modifyDate) {
            this.modifyDate = modifyDate;
        }
        public BIGINT getmodifiedBy() {
            return modifiedBy;
        }
        public void setmodifiedBy(BIGINT modifiedBy) {
            this.modifiedBy = modifiedBy;
        }
        public INT getactivated() {
            return activated;
        }
        public void setactivated(INT activated) {
            this.activated = activated;
        }
}
