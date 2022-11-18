//[app](../../../index.md)/[com.example.proyectois](../index.md)/[ContactoAdapter](index.md)

# ContactoAdapter

[androidJvm]\
class [ContactoAdapter](index.md) : [RecyclerView.Adapter](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.Adapter.html)&lt;[ContactoAdapter.PAVH](-p-a-v-h/index.md)&gt;

## Constructors

| | |
|---|---|
| [ContactoAdapter](-contacto-adapter.md) | [androidJvm]<br>fun [ContactoAdapter](-contacto-adapter.md)() |

## Types

| Name | Summary |
|---|---|
| [PACL](-p-a-c-l/index.md) | [androidJvm]<br>interface [PACL](-p-a-c-l/index.md) |
| [PAVH](-p-a-v-h/index.md) | [androidJvm]<br>class [PAVH](-p-a-v-h/index.md) : [RecyclerView.ViewHolder](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.ViewHolder.html) |

## Functions

| Name | Summary |
|---|---|
| [bindViewHolder](index.md#-907624955%2FFunctions%2F-912451524) | [androidJvm]<br>fun [bindViewHolder](index.md#-907624955%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [ContactoAdapter.PAVH](-p-a-v-h/index.md), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [createViewHolder](index.md#1423244545%2FFunctions%2F-912451524) | [androidJvm]<br>@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)<br>fun [createViewHolder](index.md#1423244545%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [ViewGroup](https://developer.android.com/reference/kotlin/android/view/ViewGroup.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [ContactoAdapter.PAVH](-p-a-v-h/index.md) |
| [getItemCount](get-item-count.md) | [androidJvm]<br>open override fun [getItemCount](get-item-count.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getItemId](index.md#725914875%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [getItemId](index.md#725914875%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [getItemViewType](index.md#714126295%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [getItemViewType](index.md#714126295%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [hasObservers](index.md#1092162006%2FFunctions%2F-912451524) | [androidJvm]<br>fun [hasObservers](index.md#1092162006%2FFunctions%2F-912451524)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hasStableIds](index.md#16685238%2FFunctions%2F-912451524) | [androidJvm]<br>fun [hasStableIds](index.md#16685238%2FFunctions%2F-912451524)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [notifyDataSetChanged](index.md#-1095556076%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyDataSetChanged](index.md#-1095556076%2FFunctions%2F-912451524)() |
| [notifyItemChanged](index.md#-1721030169%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyItemChanged](index.md#-1721030169%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>fun [notifyItemChanged](index.md#748267402%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), @[Nullable](https://developer.android.com/reference/kotlin/androidx/annotation/Nullable.html)p1: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?) |
| [notifyItemInserted](index.md#2137269507%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyItemInserted](index.md#2137269507%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [notifyItemMoved](index.md#-1694317867%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyItemMoved](index.md#-1694317867%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [notifyItemRangeChanged](index.md#1769183193%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyItemRangeChanged](index.md#1769183193%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>fun [notifyItemRangeChanged](index.md#1916975740%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), @[Nullable](https://developer.android.com/reference/kotlin/androidx/annotation/Nullable.html)p2: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?) |
| [notifyItemRangeInserted](index.md#-2104748521%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyItemRangeInserted](index.md#-2104748521%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [notifyItemRangeRemoved](index.md#999899269%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyItemRangeRemoved](index.md#999899269%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [notifyItemRemoved](index.md#-189254469%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyItemRemoved](index.md#-189254469%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [onAttachedToRecyclerView](index.md#-1243461790%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onAttachedToRecyclerView](index.md#-1243461790%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [RecyclerView](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.html)) |
| [onBindViewHolder](on-bind-view-holder.md) | [androidJvm]<br>open override fun [onBindViewHolder](on-bind-view-holder.md)(holder: [ContactoAdapter.PAVH](-p-a-v-h/index.md), position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>open fun [onBindViewHolder](index.md#-947159528%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [ContactoAdapter.PAVH](-p-a-v-h/index.md), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), @[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p2: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;) |
| [onCreateViewHolder](on-create-view-holder.md) | [androidJvm]<br>open override fun [onCreateViewHolder](on-create-view-holder.md)(parent: [ViewGroup](https://developer.android.com/reference/kotlin/android/view/ViewGroup.html), viewType: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [ContactoAdapter.PAVH](-p-a-v-h/index.md) |
| [onDetachedFromRecyclerView](index.md#-1201433889%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onDetachedFromRecyclerView](index.md#-1201433889%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [RecyclerView](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.html)) |
| [onFailedToRecycleView](index.md#626119299%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onFailedToRecycleView](index.md#626119299%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [ContactoAdapter.PAVH](-p-a-v-h/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [onViewAttachedToWindow](index.md#-1756634531%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onViewAttachedToWindow](index.md#-1756634531%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [ContactoAdapter.PAVH](-p-a-v-h/index.md)) |
| [onViewDetachedFromWindow](index.md#-2089986278%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onViewDetachedFromWindow](index.md#-2089986278%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [ContactoAdapter.PAVH](-p-a-v-h/index.md)) |
| [onViewRecycled](index.md#1739566463%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onViewRecycled](index.md#1739566463%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [ContactoAdapter.PAVH](-p-a-v-h/index.md)) |
| [registerAdapterDataObserver](index.md#-149943229%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [registerAdapterDataObserver](index.md#-149943229%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [RecyclerView.AdapterDataObserver](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.AdapterDataObserver.html)) |
| [setHasStableIds](index.md#1991189249%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [setHasStableIds](index.md#1991189249%2FFunctions%2F-912451524)(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [unregisterAdapterDataObserver](index.md#607934410%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [unregisterAdapterDataObserver](index.md#607934410%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [RecyclerView.AdapterDataObserver](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.AdapterDataObserver.html)) |

## Properties

| Name | Summary |
|---|---|
| [clickListener](click-listener.md) | [androidJvm]<br>var [clickListener](click-listener.md): [ContactoAdapter.PACL](-p-a-c-l/index.md)? = null |
| [contactos](contactos.md) | [androidJvm]<br>lateinit var [contactos](contactos.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ContactoClient.Contacto](../../com.example.proyectois.service/-contacto-client/-contacto/index.md)&gt; |
