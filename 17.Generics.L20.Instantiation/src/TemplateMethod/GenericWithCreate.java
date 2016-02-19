package TemplateMethod;

/**
 * Created by Mike on 19.02.2016.
 */
abstract class GenericWithCreate<T> {
    final T element;

    GenericWithCreate() {
        this.element = create();
    }

    abstract T create();
}
