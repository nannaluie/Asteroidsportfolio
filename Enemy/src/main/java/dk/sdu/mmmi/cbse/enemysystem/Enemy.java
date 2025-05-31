package dk.sdu.mmmi.cbse.enemysystem;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

public class Enemy extends Entity {

    @Override
    public void onCollision(World world, GameData gameData) {
        EnemyPlugin addEnemy = new EnemyPlugin();
        world.addEntity(addEnemy.createEnemy(gameData));
    }


}