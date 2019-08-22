from cc3002.auxiliares2019p.aux1.hero import Hero

if __name__ == '__main__':
    lyn = Hero("Lyn")
    eliwood = Hero("Eliwood")
    print(f"{lyn.name} has {lyn.hit_points} hit points")
    print(f"{eliwood.name} has {eliwood.hit_points} hit points")
    lyn.attack(eliwood)
    print(f"{lyn.name} attacked {eliwood.name}")
    print(f"{eliwood.name} has {eliwood.hit_points} hit points")
