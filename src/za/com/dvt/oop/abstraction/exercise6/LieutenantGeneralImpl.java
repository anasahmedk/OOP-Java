package za.com.dvt.oop.abstraction.exercise6;

import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private final TreeSet<PrivateImpl> privates;

    public LieutenantGeneralImpl(final int id, final String firstName, final String lastName, final double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new TreeSet<>();
    }

    public void addPrivate(final PrivateImpl priv) {
        this.privates.add(priv);
    }

    @Override
    public Collection<PrivateImpl> getPrivates() {
        return Collections.unmodifiableCollection(this.privates);
    }

    @Override
    public String toString() {
        if (this.privates.isEmpty()) {
            return super.toString() + System.lineSeparator() + "Privates:";
        }
        StringBuilder sb = new StringBuilder(String.format("Privates:%n"));

        AtomicInteger br = new AtomicInteger();
        this.privates.forEach(e -> {
            sb.append(" ").append(e);
            if (br.get() != this.privates.size() - 1) {
                sb.append(System.lineSeparator());
            }
            br.getAndIncrement();
        });

        return super.toString() + System.lineSeparator() + sb;
    }
}