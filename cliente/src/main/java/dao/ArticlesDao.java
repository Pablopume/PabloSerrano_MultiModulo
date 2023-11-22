package dao;


import domain.modelo.Proyecto;


import java.util.List;

public interface ArticlesDao {
   Either<String, List<Proyecto>> getAllArticles();

    Single<Either<String, List<Proyecto>>> getArticlesByName(String name);

    Single<Either<String, Proyecto>> addArticle(Proyecto proyecto);
}
