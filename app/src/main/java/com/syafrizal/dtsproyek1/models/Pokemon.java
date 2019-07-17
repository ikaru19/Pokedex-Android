package com.syafrizal.dtsproyek1.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Pokemon implements Parcelable {
    String name;
    String type;
    String picture;
    String seed;
    int hp;
    int attack;
    int defense;
    int speed;
    int speedattack;
    int speeddef;
    double height;
    int catchRate;
    String abillities;
    double weight;
    double genderRatioMale;
    double genderRatioFemale;
    int hatchsteps;
    String evolution;



    public Pokemon(String name, String type, String picture, String seed, int hp, int attack, int defense, int speed, int speedattack, int speeddef, double height, int catchRate, String abillities, double weight, double genderRatioMale, double genderRatioFemale, int hatchsteps, String evolution) {
        this.name = name;
        this.type = type;
        this.picture = picture;
        this.seed = seed;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.speedattack = speedattack;
        this.speeddef = speeddef;
        this.height = height;
        this.catchRate = catchRate;
        this.abillities = abillities;
        this.weight = weight;
        this.genderRatioMale = genderRatioMale;
        this.genderRatioFemale = genderRatioFemale;
        this.hatchsteps = hatchsteps;
        this.evolution = evolution;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeedattack() {
        return speedattack;
    }

    public void setSpeedattack(int speedattack) {
        this.speedattack = speedattack;
    }

    public int getSpeeddef() {
        return speeddef;
    }

    public void setSpeeddef(int speeddef) {
        this.speeddef = speeddef;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getCatchRate() {
        return catchRate;
    }

    public void setCatchRate(int catchRate) {
        this.catchRate = catchRate;
    }

    public String getAbillities() {
        return abillities;
    }

    public void setAbillities(String abillities) {
        this.abillities = abillities;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getGenderRatioMale() {
        return genderRatioMale;
    }

    public void setGenderRatioMale(double genderRatioMale) {
        this.genderRatioMale = genderRatioMale;
    }

    public double getGenderRatioFemale() {
        return genderRatioFemale;
    }

    public void setGenderRatioFemale(double genderRatioFemale) {
        this.genderRatioFemale = genderRatioFemale;
    }

    public int getHatchsteps() {
        return hatchsteps;
    }

    public void setHatchsteps(int hatchsteps) {
        this.hatchsteps = hatchsteps;
    }

    public String getEvolution() {
        return evolution;
    }

    public void setEvolution(String evolution) {
        this.evolution = evolution;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.type);
        dest.writeString(this.picture);
        dest.writeString(this.seed);
        dest.writeInt(this.hp);
        dest.writeInt(this.attack);
        dest.writeInt(this.defense);
        dest.writeInt(this.speed);
        dest.writeInt(this.speedattack);
        dest.writeInt(this.speeddef);
        dest.writeDouble(this.height);
        dest.writeInt(this.catchRate);
        dest.writeString(this.abillities);
        dest.writeDouble(this.weight);
        dest.writeDouble(this.genderRatioMale);
        dest.writeDouble(this.genderRatioFemale);
        dest.writeInt(this.hatchsteps);
        dest.writeString(this.evolution);
    }

    protected Pokemon(Parcel in) {
        this.name = in.readString();
        this.type = in.readString();
        this.picture = in.readString();
        this.seed = in.readString();
        this.hp = in.readInt();
        this.attack = in.readInt();
        this.defense = in.readInt();
        this.speed = in.readInt();
        this.speedattack = in.readInt();
        this.speeddef = in.readInt();
        this.height = in.readDouble();
        this.catchRate = in.readInt();
        this.abillities = in.readString();
        this.weight = in.readDouble();
        this.genderRatioMale = in.readDouble();
        this.genderRatioFemale = in.readDouble();
        this.hatchsteps = in.readInt();
        this.evolution = in.readString();
    }

    public static final Parcelable.Creator<Pokemon> CREATOR = new Parcelable.Creator<Pokemon>() {
        @Override
        public Pokemon createFromParcel(Parcel source) {
            return new Pokemon(source);
        }

        @Override
        public Pokemon[] newArray(int size) {
            return new Pokemon[size];
        }
    };
}
