import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import dk.sdu.mmmi.cbse.enemysystem.EnemyPlugin;
import dk.sdu.mmmi.cbse.enemysystem.EnemyProcessor;

module Enemy {
    requires Common;
    provides IEntityProcessingService with EnemyProcessor;
    provides IGamePluginService with EnemyPlugin;
    requires CommonBullet;
    requires spring.context;
    uses dk.sdu.mmmi.cbse.common.bullet.BulletSPI;

}
}

