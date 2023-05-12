import generosLivros.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        FiccaoCientifica fc = new FiccaoCientifica();
        Fantasia f = new Fantasia();
        Distopia d = new Distopia();
        AcaoAventura aa = new AcaoAventura();
        FiccaoPolicial fp = new FiccaoPolicial();
        Horror h = new Horror();
        ThrillerSuspense ts = new ThrillerSuspense();
        FiccaoHistorica fh = new FiccaoHistorica();
        RPGdeMesa rpg = new RPGdeMesa();
        Scanner sc = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Cadastrar livro de fantasia");
            System.out.println("2. Cadastrar livro de ficção científica");
            System.out.println("3. Cadastrar livro de distopia");
            System.out.println("4. Cadastrar livro de Açao e aventura");
            System.out.println("5. Cadastrar livro de Ficção Policial");
            System.out.println("6. Cadastrar livro de Horror");
            System.out.println("7. Cadastrar livro de thriller e suspense");
            System.out.println("8. Cadastrar livro de ficção historica");
            System.out.println("9. cadastrar livro de rpg de mesa");
            System.out.println("10. Listar livros cadastradas");
            System.out.println("11. Excluir livro cadastrada");
            System.out.println("12. Alterar livro cadastrada");
            System.out.println("13 - Listar apenas os livros fantasia");
            System.out.println("14 - Listar apenas os livros ficçao científica");
            System.out.println("15 - Listar apenas os livros distopia");
            System.out.println("16 - Listar apenas os livros ação e aventura");
            System.out.println("17 - Listar apenas os livros ficçao policial");
            System.out.println("18 - Listar apenas os livros horror");
            System.out.println("19 - Listar apenas os livros thriller e suspense");
            System.out.println("20 - Listar apenas os livros ficçao historica");
            System.out.println("21 - Listar apenas os livros RPG");
            System.out.println("22. Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o nome do livro de fantasia:");
                    f.setNome(sc.next());
                    System.out.println("Digite o/a nome do autor/a:");
                    f.setAutorNome(sc.next());
                    System.out.println("Digite a quantidade de paginas:");
                    f.setPaginas(sc.next());
                    livros.add(f);
                }
                case 2 -> {
                    System.out.println("Digite o nome do livro de ficçao cientifica:");
                    fc.setNome(sc.next());
                    System.out.println("Digite o/a nome do autor/a:");
                    fc.setAutorNome(sc.next());
                    System.out.println("Digite a quantidade de paginas:");
                    fc.setPaginas(sc.next());
                    livros.add(fc);
                }
                case 3 -> {
                    System.out.println("Digite o nome do livro de distopia:");
                    d.setNome(sc.next());
                    System.out.println("Digite o/a nome do autor/a:");
                    d.setAutorNome(sc.next());
                    System.out.println("Digite a quantidade de paginas:");
                    d.setPaginas(sc.next());
                    livros.add(d);
                }
                case 4 -> {
                    System.out.println("Digite o nome do livro de açao e aventura:");
                    aa.setNome(sc.next());
                    System.out.println("Digite o/a nome do autor/a:");
                    aa.setAutorNome(sc.next());
                    System.out.println("Digite a quantidade de paginas:");
                    aa.setPaginas(sc.next());
                    livros.add(aa);
                }
                case 5 -> {
                    System.out.println("Digite o nome do livro de horror:");
                    fp.setNome(sc.next());
                    System.out.println("Digite o/a nome do autor/a:");
                    fp.setAutorNome(sc.next());
                    System.out.println("Digite a quantidade de paginas:");
                    fp.setPaginas(sc.next());
                    livros.add(fp);
                }
                case 6 -> {
                    System.out.println("Digite o nome do livro de ficção policial:");
                    h.setNome(sc.next());
                    System.out.println("Digite o/a nome do autor/a:");
                    h.setAutorNome(sc.next());
                    System.out.println("Digite a quantidade de paginas:");
                    h.setPaginas(sc.next());
                    livros.add(h);
                }
                case 7 -> {
                    System.out.println("Digite o nome do livro de thriller e suspense:");
                    ts.setNome(sc.next());
                    System.out.println("Digite o/a nome do autor/a:");
                    ts.setAutorNome(sc.next());
                    System.out.println("Digite a quantidade de paginas:");
                    ts.setPaginas(sc.next());
                    livros.add(ts);
                }
                case 8 -> {
                    System.out.println("Digite o nome do livro de ficção policial:");
                    fh.setNome(sc.next());
                    System.out.println("Digite o/a nome do autor/a:");
                    fh.setAutorNome(sc.next());
                    System.out.println("Digite a quantidade de paginas:");
                    fh.setPaginas(sc.next());
                    livros.add(fh);
                }
                case 9 -> {
                    System.out.println("Digite o nome do livro de rpg:");
                    rpg.setNome(sc.next());
                    System.out.println("Digite o/a nome do autor/a:");
                    rpg.setAutorNome(sc.next());
                    System.out.println("Digite a quantidade de paginas:");
                    rpg.setPaginas(sc.next());
                    System.out.println("Digita o nome do Sistema que o livro faz parte:");
                    rpg.setSistema(sc.next());
                    livros.add(rpg);
                }
                case 10 -> {
                    System.out.println("\nLista de livros cadastradas:");
                    for (Livro p : livros) {
                        if (p instanceof FiccaoCientifica) {
                            System.out.println("nome:" + fc.getNome() + "autor/a:" + fc.getAutorNome() + "paginas:" + fc.getPaginas());
                        } else if (p instanceof Fantasia) {
                            System.out.println("nome:" + f.getNome() + "autor/a:" + f.getAutorNome() + "paginas:" + f.getPaginas());
                        } else if (p instanceof Distopia) {
                            System.out.println("nome:" + d.getNome() + "autor/a:" + d.getAutorNome() + "paginas:" + d.getPaginas());
                        } else if (p instanceof AcaoAventura) {
                            System.out.println("nome:" + aa.getNome() + "autor/a:" + aa.getAutorNome() + "paginas:" + aa.getPaginas());
                        } else if (p instanceof FiccaoPolicial) {
                            System.out.println("nome:" + fp.getNome() + "autor/a:" + fp.getAutorNome() + "paginas:" + fp.getPaginas());
                        } else if (p instanceof Horror) {
                            System.out.println("nome:" + h.getNome() + "autor/a:" + h.getAutorNome() + "paginas:" + h.getPaginas());
                        } else if (p instanceof ThrillerSuspense) {
                            System.out.println("nome:" + ts.getNome() + "autor/a:" + ts.getAutorNome() + "paginas:" + ts.getPaginas());
                        } else if (p instanceof FiccaoHistorica) {
                            System.out.println("nome:" + fh.getNome() + "autor/a:" + fh.getAutorNome() + "paginas:" + fh.getPaginas());
                        } else if (p instanceof RPGdeMesa) {
                            System.out.println("nome:" + rpg.getNome() + "autor/a:" + rpg.getAutorNome() + "paginas:" + rpg.getPaginas() + "Sistema:" + rpg.getSistema());
                        }
                    }
                }
                case 11 -> {
                    System.out.println("Digite o nome do livro a ser excluido:");
                    String nome = sc.next();
                    boolean encontrou = false;
                    for (Livro p : livros) {
                        if (p.getNome().equals(nome)) {
                            livros.remove(p);
                            System.out.println("generosLivros.Livro excluida com sucesso!");
                            encontrou = true;
                            break;
                        }
                    }
                    if (!encontrou) {
                        System.out.println(" nenhum livro com esse nome!");
                    }
                }
                case 12 -> {
                    System.out.println("\nDigite o nome do livro a ser alterada");
                    String nome2 = sc.next();
                    boolean encontrou1 = false;
                    for (Livro p : livros) {
                        if (p.getNome().equals(nome2)) {
                            if (p instanceof FiccaoCientifica) {
                                System.out.println("Digite o novo nome do livro de Ficção fantasia:");
                                f.setNome(sc.next());
                                System.out.println("Digite o novo autor/a:");
                                f.setAutorNome(sc.next());
                                System.out.println("Digite a nova quantidade de paginas");
                                f.setPaginas(sc.next());
                            } else if (p instanceof Fantasia) {
                                System.out.println("Digite o novo nome do livro de ficçao cientifica:");
                                fc.setNome(sc.next());
                                System.out.println("Digite o novo autor/a:");
                                fc.setAutorNome(sc.next());
                                System.out.println("Digite o novo quantidade de paginas");
                                fc.setPaginas(sc.next());
                            } else if (p instanceof Distopia) {
                                System.out.println("Digite o novo nome do livro de distopia:");
                                d.setNome(sc.next());
                                System.out.println("Digite o novo autor/a:");
                                d.setAutorNome(sc.next());
                                System.out.println("Digite o novo quantidade de paginas");
                                d.setPaginas(sc.next());
                            } else if (p instanceof AcaoAventura) {
                                System.out.println("Digite o novo nome do livro de açao e aventura:");
                                aa.setNome(sc.next());
                                System.out.println("Digite o novo autor/a:");
                                aa.setAutorNome(sc.next());
                                System.out.println("Digite o novo quantidade de paginas");
                                aa.setPaginas(sc.next());
                            } else if (p instanceof FiccaoPolicial) {
                                System.out.println("Digite o novo nome do livro de ficçao policial:");
                                fp.setNome(sc.next());
                                System.out.println("Digite o novo autor/a:");
                                fp.setAutorNome(sc.next());
                                System.out.println("Digite o novo quantidade de paginas");
                                fp.setPaginas(sc.next());
                            } else if (p instanceof Horror) {
                                System.out.println("Digite o novo nome do livro de horror:");
                                h.setNome(sc.next());
                                System.out.println("Digite o novo autor/a:");
                                h.setAutorNome(sc.next());
                                System.out.println("Digite o novo quantidade de paginas");
                                h.setPaginas(sc.next());
                            } else if (p instanceof ThrillerSuspense) {
                                System.out.println("Digite o novo nome do livro de thriller e suspense:");
                                ts.setNome(sc.next());
                                System.out.println("Digite o novo autor/a:");
                                ts.setAutorNome(sc.next());
                                System.out.println("Digite o novo quantidade de paginas");
                                ts.setPaginas(sc.next());
                            } else if (p instanceof FiccaoHistorica) {
                                System.out.println("Digite o novo nome do livro de ficçao historica:");
                                fh.setNome(sc.next());
                                System.out.println("Digite o novo autor/a:");
                                fh.setAutorNome(sc.next());
                                System.out.println("Digite o novo quantidade de paginas");
                                fh.setPaginas(sc.next());
                            } else if (p instanceof RPGdeMesa) {
                                System.out.println("Digite o novo nome do livro de RPG de mesa:");
                                rpg.setNome(sc.next());
                                System.out.println("Digite o novo autor/a:");
                                rpg.setAutorNome(sc.next());
                                System.out.println("Digite o novo quantidade de paginas");
                                rpg.setPaginas(sc.next());
                                System.out.println("Digite o novo sistema do livro:");
                                rpg.setSistema(sc.next());
                            }
                            System.out.println("generosLivros.Livro alterado com sucesso!");
                            encontrou1 = true;
                            break;
                        }
                    }
                    if (!encontrou1) {
                        System.out.println("Nenhum livro com esse nome!");
                    }
                }
                case 13 -> {
                    System.out.println("Lista de livros do genero fantasia");
                    for (Livro p : livros) {
                        if (p instanceof Fantasia) {
                            System.out.println(f);
                        }
                    }
                }
                case 14 -> {
                    System.out.println("Lista de livros do genero de ficçao cientifica");
                    for (Livro p : livros) {
                        if (p instanceof FiccaoCientifica) {
                            System.out.println(fc);
                        }
                    }
                }
                case 15 -> {
                    System.out.println("Lista de livros do genero de distopia");
                    for (Livro p : livros) {
                        if (p instanceof Distopia) {
                            System.out.println(d);
                        }
                    }
                }
                case 16 -> {
                    System.out.println("Lista de livros do genero de açao e aventura");
                    for (Livro p : livros) {
                        if (p instanceof AcaoAventura) {
                            System.out.println(aa);
                        }
                    }
                }
                case 17 -> {
                    System.out.println("Lista de livros do genero de ficçao policial");
                    for (Livro p : livros) {
                        if (p instanceof FiccaoPolicial) {
                            System.out.println(fp);
                        }
                    }
                }
                case 18 -> {
                    System.out.println("Lista de livros do genero de horror");
                    for (Livro p : livros) {
                        if (p instanceof Horror) {
                            System.out.println(h);
                        }
                    }
                }
                case 19 -> {
                    System.out.println("Lista de livros do genero de Thriller e Suspense");
                    for (Livro p : livros) {
                        if (p instanceof ThrillerSuspense) {
                            System.out.println(ts);
                        }
                    }
                }
                case 20 -> {
                    System.out.println("Lista de livros do genero de ficçao historica");
                    for (Livro p : livros) {
                        if (p instanceof FiccaoHistorica) {
                            System.out.println(fh);
                        }
                    }
                }
                case 21 -> {
                    System.out.println("Lista de livros de RPG de mesa");
                    for (Livro p : livros) {
                        if (p instanceof RPGdeMesa) {
                            System.out.println(rpg);
                        }
                    }
                }
                case 22 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 22);
    }
}