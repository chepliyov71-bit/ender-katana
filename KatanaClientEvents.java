package com.voidforge.enderkatana.network;

import com.voidforge.enderkatana.EnderKatana;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

public record AbilityPayload(int ability) implements CustomPacketPayload {
    public static final Type<AbilityPayload> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(EnderKatana.MOD_ID, "ability"));
    public static final StreamCodec<ByteBuf, AbilityPayload> STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.VAR_INT, AbilityPayload::ability, AbilityPayload::new);

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
