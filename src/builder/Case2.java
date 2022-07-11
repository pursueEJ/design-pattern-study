package builder;

public class Case2 {

    public static void main(String[] args) {
        ActorDirector actorDirector = new ActorDirector();
        Actor hero = actorDirector.construct(new HeroBuilder());
        Actor angel = actorDirector.construct(new AngelBuilder());
        Actor devil = actorDirector.construct(new DevilBuilder());

        System.out.println(hero);
        System.out.println(angel);
        System.out.println(devil);
    }

    static class Actor {
        private String type; //角色类型
        private String sex; //性别
        private String face; //脸型
        private String costume; //服装
        private String hairstyle; //发型

        public void setType(String type) {
            this.type = type;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public void setFace(String face) {
            this.face = face;
        }

        public void setCostume(String costume) {
            this.costume = costume;
        }

        public void setHairstyle(String hairstyle) {
            this.hairstyle = hairstyle;
        }

        public String getType() {
            return (this.type);
        }

        public String getSex() {
            return (this.sex);
        }

        public String getFace() {
            return (this.face);
        }

        public String getCostume() {
            return (this.costume);
        }

        public String getHairstyle() {
            return (this.hairstyle);
        }

        @Override
        public String toString() {
            return "Actor{" +
                    "type='" + type + '\'' +
                    ", sex='" + sex + '\'' +
                    ", face='" + face + '\'' +
                    ", costume='" + costume + '\'' +
                    ", hairstyle='" + hairstyle + '\'' +
                    '}';
        }
    }

    //角色建造器：抽象建造者
    abstract static class ActorBuilder {
        protected Actor actor = new Actor();

        public abstract void buildType();

        public abstract void buildSex();

        public abstract void buildFace();

        public abstract void buildCostume();

        public abstract void buildHairstyle();

        //工厂方法，返回一个完整的游戏角色对象
        public Actor createActor() {
            return actor;
        }
    }

    //英雄角色建造器：具体建造者
    static class HeroBuilder extends ActorBuilder {
        public void buildType() {
            actor.setType("英雄");
        }

        public void buildSex() {
            actor.setSex("男");
        }

        public void buildFace() {
            actor.setFace("英俊");
        }

        public void buildCostume() {
            actor.setCostume("盔甲");
        }

        public void buildHairstyle() {
            actor.setHairstyle("飘逸");
        }
    }

    //天使角色建造器：具体建造者
    static class AngelBuilder extends ActorBuilder {
        public void buildType() {
            actor.setType("天使");
        }

        public void buildSex() {
            actor.setSex("女");
        }

        public void buildFace() {
            actor.setFace("漂亮");
        }

        public void buildCostume() {
            actor.setCostume("白裙");
        }

        public void buildHairstyle() {
            actor.setHairstyle("披肩长发");
        }
    }

    //恶魔角色建造器：具体建造者
    static class DevilBuilder extends ActorBuilder {
        public void buildType() {
            actor.setType("恶魔");
        }

        public void buildSex() {
            actor.setSex("妖");
        }

        public void buildFace() {
            actor.setFace("丑陋");
        }

        public void buildCostume() {
            actor.setCostume("黑衣");
        }

        public void buildHairstyle() {
            actor.setHairstyle("光头");
        }
    }

    static class ActorDirector {
        public Actor construct(ActorBuilder ab) {
            Actor actor;
            ab.buildType();
            ab.buildSex();
            ab.buildFace();
            ab.buildCostume();
            ab.buildHairstyle();
            actor = ab.createActor();
            return actor;
        }
    }

}
