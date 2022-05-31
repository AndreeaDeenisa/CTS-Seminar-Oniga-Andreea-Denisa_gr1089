package suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import categorii.CategorieBoundary;
import categorii.CategorieUtilizareFake;
import teste.TestAgentieCuDubluri;
import teste.TestPachetTuristic;

//foarte important!!! intra la examen
//daca avem RunWith(Categories.class) le va rula doar pe cele care au adnotarea categories
//daca avem RunWith(Suite.class) le va rula pe toate si NU va mai tine cont de adnotarea Categories

@RunWith(Categories.class) //specificam cu ce anume sa rulam
@Suite.SuiteClasses({TestAgentieCuDubluri.class, TestPachetTuristic.class})
@Categories.IncludeCategory(CategorieUtilizareFake.class)
@Categories.ExcludeCategory(CategorieBoundary.class)
public class SuitaTesteCuFakeuri {

}