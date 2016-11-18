package org.fundacionjala.sevenwonders.core;

import com.google.common.base.Preconditions;
import org.fundacionjala.sevenwonders.core.effect.Effect;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Luis Gumucio
 */
public class Side {

    private String nameSide;
    private Effect effect;
    private List<StageType> stages;

    public Side(String nameSide, Effect effect, List<StageType> stages) {
        Preconditions.checkNotNull(nameSide, "The nameSide is null");
        Preconditions.checkNotNull(effect, "The effect is null");
        Preconditions.checkNotNull(stages, "The stages is null");
        this.nameSide = nameSide;
        this.effect = effect;
        this.stages = stages;
    }

    public Side(List<StageType> stages, Effect effect) {
        this.stages = stages;
        this.effect = effect;
    }

    public String getNameSide() {
        return nameSide;
    }

    public Effect getEffect() {
        return effect;
    }

    public List<StageType> getStages() {
        return stages;
    }

}
