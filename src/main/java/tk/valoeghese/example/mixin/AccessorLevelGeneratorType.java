package tk.valoeghese.example.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.world.level.LevelGeneratorType;

@Mixin(LevelGeneratorType.class)
public interface AccessorLevelGeneratorType {
    @Invoker("<init>")
    static LevelGeneratorType create(int id, String name) {
        throw new AssertionError("f");
    }
}