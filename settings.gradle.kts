rootProject.name = "better_direnv"

include(
    "modules/core",
    "modules/products/nodejs"
)

rootProject.children.forEach {
    it.name = (it.name.replaceFirst("modules/", "better_direnv/").replace("/", "-"))
}
