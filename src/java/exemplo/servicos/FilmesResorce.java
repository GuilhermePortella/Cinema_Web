package exemplo.servicos;

import com.google.gson.Gson;
import exemplo.modelo.Filme;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Guilherme
 */
@Path("filmes")
public class FilmesResorce {

    private List<Filme> filmes;

    /**
     * Creates a new instance of FilmesResorce
     */
    public FilmesResorce() {
        filmes = new ArrayList<Filme>();
        filmes.add(new Filme(1L,"Jogos da Jogos Vorazes: Em chamas", "Continuidade ao filme jogos da Jogos Vorazes: a esperança", "acao",121,"<iframe width='560' height='315' scr='https://www.youtube.com/watch?v=cKyrXQSsSl4' frameborder='0' allowfullscreen></iframe>"));
        filmes.add(new Filme(2L, "La La Land", "Musical sobre o amor","romance",231,"<iframe width='560' height='315' scr='https://www.youtube.com/watch?v=0pdqf4P9MB8' frameborder='0' allowfullscreen></iframe>"));
        filmes.add(new Filme(3L, "Forrest Gump", "Forrest, um homem com baixo QI, relata os primeiros anos de sua vida, quando se viu no meio de eventos históricos importantes", "Drama/Romance",133,"<iframe width='560' height='315' scr='https://www.youtube.com/watch?v=bLvqoHBptjg&ab_channel=ParamountMovies' frameborder='0' allowfullscreen></iframe>"));
    }

    /**
     * Retrieves representation of an instance of exemplo.servicos.FilmesResorce
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        Gson gson = new Gson();
        return gson.toJson(filmes);
    }

    /**
     * PUT method for updating or creating an instance of FilmesResorce
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
