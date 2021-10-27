package com.slyworks.a14_proxy_pattern.protection_proxy;

import java.lang.reflect.Proxy;

public class PersonBeanImpl implements PersonBean{
    //region Vars
    private String mName;
    private String mGender;
    private String[] mInterests;
    private int mRating = 0;
    private int mRatingCount = 0;
    private String mNickName;
    //endregion

    private PersonBeanImpl(Builder builder){
        setName(builder.mName);
        setGender(builder.mGender);
        setInterests(builder.mInterests);
        setNickName(builder.mNickName);
        setHotOrNotRating(builder.mRating);
    }

    //region Getters
    @Override
    public String getName() {
        return mName;
    }

    @Override
    public String getGender() {
        return mGender;
    }

    @Override
    public String[] getInterests() {
        return mInterests;
    }
    //endregion

    //region Setters
    @Override
    public int getHotOrNotRating() {
        if(mRatingCount == 0) return 0;
        return (mRating/mRatingCount);
    }

    @Override
    public void setName(String name) {
         this.mName = name;
    }

    @Override
    public void setGender(String gender) {
          this.mGender = mGender;
    }

    @Override
    public void setInterests(String[] interests) {
          this.mInterests = interests;
    }

    public void setNickName(String nickName){ this.mNickName = nickName; }

    @Override
    public void setHotOrNotRating(int rating) {
            this.mRating += rating;
            mRatingCount++;
    }
    //endregion

    public PersonBean getNonOwnerProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBean)
        );

    }
    public static class Builder{
        //region Vars
        private String mName;
        private String mGender;
        private String[] mInterests = new String[0];
        private String mNickName = "";
        private int mRating = 0;
        private int mRatingCount = 0;
        //endregion
        public Builder(String gender, String name){}

        public Builder name(String name){
            mName = name;
            return this;
        }

        public Builder gender(String gender){
            mGender = gender;
            return this;
        }

        public Builder interests(String[] interests){
            mInterests = interests;
            return this;
        }

        public Builder hotOrNotRating(int rating){
            mRating += rating;
            mRatingCount++;
            return this;
        }

        public PersonBeanImpl build(){
            return new PersonBeanImpl(this);
        }
    }
}
