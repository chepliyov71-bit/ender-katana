package com.voidforge.enderkatana.network;

import com.voidforge.enderkatana.EnderKatana;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

public record EnergySyncPayload(int energy, int dashCooldown, int slashCooldown, boolean empowered, boolean absoluteForm) implements CustomPacketPayload {
    public static final Type<EnergySyncPayload> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(EnderKatana.MOD_ID, "energy_sync"));
    public static final StreamCodec<ByteBuf, EnergySyncPayload> STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.VAR_INT, EnergySyncPayload::energy,
            ByteBufCodecs.VAR_INT, EnergySyncPayload::dashCooldown,
            ByteBufCodecs.VAR_INT, EnergySyncPayload::slashCooldown,
            ByteBufCodecs.BOOL, EnergySyncPayload::empowered,
            ByteBufCodecs.BOOL, EnergySyncPayload::absoluteForm,
            EnergySyncPayload::new);

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
