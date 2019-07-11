package com.syafrizal.dtsproyek1.models;

public class Pokemon {
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
}
