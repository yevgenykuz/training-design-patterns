package me.yevgeny.training.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is another concrete element. It will be visited by the visitor.
 *
 * @author Yevgeny Kuznetsov
 */
public class PartsOrder implements AtvPart {
    private List<AtvPart> parts;

    public PartsOrder() {
        this.parts = new ArrayList<>();
    }

    public void addPart(AtvPart atvPart) {
        parts.add(atvPart);
    }

    public List<AtvPart> getParts() {
        return Collections.unmodifiableList(parts);
    }

    @Override
    public void accept(AtvPartVisitor visitor) {
        for (AtvPart atvPart : parts) {
            atvPart.accept(visitor);
        }
        visitor.visit(this);
    }
}
