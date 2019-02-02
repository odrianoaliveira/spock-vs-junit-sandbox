package com.omio.spock.painter;

import com.omio.spock.Name;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.EnumMap;
import java.util.Map;

import static com.omio.spock.Name.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public abstract class PainterFactory {
    private static final Map<Name, Painter> strategies = new EnumMap<>(Name.class);

    static {
        strategies.put(PABLO_PICASSO, new PabloPicassoPainter());
        strategies.put(CANDIDO_PORTINARI, new CandidoPortinariPainter());
        strategies.put(ROMERO_BRITTO, new RomeroBrittoPainter());
    }

    public static Painter getPainterInstance(Name name){
        return strategies.get(name);
    }
}
