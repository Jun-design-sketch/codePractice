package Generic;

/*
** StringContainerはString型のみ処理できたけど、
** Genericで作ると様々なタイプが使用可能になる。
 */
public class Container<T> {
    private T value;

    public Container(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}
