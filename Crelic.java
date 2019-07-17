// package Cleric ;
public class Crelic{
  String name;
  int HP = 50;
  final int maxHP = 50;
  int MP = 10;
  final int maxMP = 10;

public Crelic(String name, int HP, int MP) {
  this.name = name;
  this.HP = HP;
  this.MP = MP;
}
public Crelic(String name, int HP) {
  this.name = name;
  this.HP = HP;
}

public void selfAid() {
  this.MP -= 5;
  this.HP = this.maxHP;
}

public int pray(int time){
  int firstMP = this.MP;
  int praytime = new java.util.Random().nextInt(3);
  int recover = time + praytime;
  this.MP = this.MP + recover;
  if (this.MP >= maxMP) {
    this.MP = maxMP;
  }
  int output = this.MP - firstMP;
  return output;
}

name h = new name(asaka);
}
