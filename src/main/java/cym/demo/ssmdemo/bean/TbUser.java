package cym.demo.ssmdemo.bean;

public class TbUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USER.USER_ID
     *
     * @mbggenerated
     */
    private Short userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USER.UNAME
     *
     * @mbggenerated
     */
    private String uname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USER.UPASS
     *
     * @mbggenerated
     */
    private String upass;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USER.USER_ID
     *
     * @return the value of TB_USER.USER_ID
     *
     * @mbggenerated
     */
    public Short getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USER.USER_ID
     *
     * @param userId the value for TB_USER.USER_ID
     *
     * @mbggenerated
     */
    public void setUserId(Short userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USER.UNAME
     *
     * @return the value of TB_USER.UNAME
     *
     * @mbggenerated
     */
    public String getUname() {
        return uname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USER.UNAME
     *
     * @param uname the value for TB_USER.UNAME
     *
     * @mbggenerated
     */
    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USER.UPASS
     *
     * @return the value of TB_USER.UPASS
     *
     * @mbggenerated
     */
    public String getUpass() {
        return upass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USER.UPASS
     *
     * @param upass the value for TB_USER.UPASS
     *
     * @mbggenerated
     */
    public void setUpass(String upass) {
        this.upass = upass == null ? null : upass.trim();
    }
}