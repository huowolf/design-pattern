package com.huowolf.controller;

import com.huowolf.builder.ActorBuilder;
import com.huowolf.pojo.Actor;

/**
 * @author huowolf
 * @date 2019/7/15
 * @description 游戏角色创建控制器：指挥者
 */
public class ActorController {
    //逐步构建复杂产品对象
    public Actor construct(ActorBuilder ab) {
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();

        //通过钩子方法来控制产品的构建
        if (!ab.isBareheaded()) {
            ab.buildHairstyle();
        }
        actor = ab.createActor();
        return actor;
    }
}