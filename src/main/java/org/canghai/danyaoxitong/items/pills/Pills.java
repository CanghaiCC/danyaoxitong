package org.canghai.danyaoxitong.items.pills;

import net.kyori.adventure.text.Component;

public enum Pills {
    SUPERIOR_1(Component.text("回神丹"), 1, Component.text("恢复20%生命值")),
    SUPERIOR_2(Component.text("敏攻丹"), 1, Component.text("60s内增加10%攻击力（冷却时间60s）")),
    SUPERIOR_3(Component.text("虚甲丹"), 1, Component.text("60s内伤害减免10%（冷却时间60s）")),
    SUPERIOR_4(Component.text("化风丹"), 1, Component.text("60s内移动速度增加50%（冷却时间60s）")),
    SUPERIOR_5(Component.text("夜明丹"), 1, Component.text("60s夜视")),
    SUPERIOR_6(Component.text("抗素丹"), 1, Component.text("60s抗火 水下呼吸 ")),
    SUPERIOR_7(Component.text("净心丹"), 1, Component.text("清除所有buff")),
    SUPERIOR_8(Component.text("隐修丹"), 1, Component.text("隐藏当前修为")),
    SUPERIOR_9(Component.text("重命丹"), 1, Component.text("回到上一次死亡地点")),
    SUPERIOR_10(Component.text("藏体丹"), 1, Component.text("隐身60s")),
    CELESTIAL_1(Component.text("安魂丹"), 2, Component.text("永久增加10生命值")),
    CELESTIAL_2(Component.text("气血丹"), 2, Component.text("永久增加1攻击力")),
    CELESTIAL_3(Component.text("壮阳丹"), 2, Component.text("永久增加1防御值")),
    CELESTIAL_4(Component.text("引灵丹"), 2, Component.text("武器所需灵力值减少1%")),
    RARE_1(Component.text("还魂丹"), 3, Component.text("永久增加10生命值")),
    RARE_2(Component.text("骤气丹"), 3, Component.text("永久增加1攻击力")),
    RARE_3(Component.text("重阳丹"), 3, Component.text("永久增加1防御值")),
    RARE_4(Component.text("聚灵丹"), 3, Component.text("每分钟获得10灵力植仙品（最多叠加三十次）"));

    private final Component displayName;
    private final int quality;
    private  final Component description;

    Pills(Component displayName, int quality, Component description) {
        this.displayName = displayName;
        this.quality = quality;
        this.description = description;
    }

    public Component getDisplayName() {
        return displayName;
    }

    public int getQuality() {
        return quality;
    }

    public Component getDescription() { return description; }

}
