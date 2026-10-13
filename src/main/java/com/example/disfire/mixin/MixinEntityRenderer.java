package com.example.disfire.mixin;

import net.minecraft.client.renderer.EntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityRenderer.class)
public class MixinEntityRenderer {

    @Inject(method = "renderFireInFirstPerson", at = @At("HEAD"), cancellable = true)
    private void onRenderFireInFirstPerson(CallbackInfo ci) {
        ci.cancel();
    }
}
