rootProject.name = "better_direnv"

include(
    "modules/core",
    "modules/products/idea",
    "modules/products/nodejs",
    "modules/products/python",
    "modules/products/phpstorm",
)

rootProject.children.forEach {
    it.name = (it.name.replaceFirst("modules/", "better_direnv/").replace("/", "-"))
}
