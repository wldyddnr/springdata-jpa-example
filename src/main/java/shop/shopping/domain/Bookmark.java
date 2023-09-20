package shop.shopping.domain;

import javax.persistence.*;

@Entity
@Table(name = "bookmarks")
public class Bookmark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 다른 필드 및 관계 매핑을 추가할 수 있습니다.

    @ManyToOne
    @JoinColumn(name = "wishlist_id", nullable = false)
    private Wishlist wishlist;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    // 생성자, getter 및 setter 등의 메서드를 작성할 수 있습니다.
}
