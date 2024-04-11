# Leaves-PMC

> [!NOTE]
>
> Leaves-PMC 专为「星社 Project」服务器打造。
>
> 此 fork 当中包含了很多硬编码的功能，且只在我们的服务器适用。
> 
> 不建议在您自己的服务器使用本 fork。
>

🍃 星社 Project 使用的修改版 Leaves。

## 🔧 构建

> [!NOTE]
>
> 此处以 Linux 系统上的步骤举例。
>
> 如果您使用的是 Windows，可能需要修改部分命令。
>

1. 将本项目拉取到你的设备：`git clone https://github.com/PlutoProject/Leaves-PMC.git`
2. 进入项目目录：`cd ./Leaves-PMC`
3. 应用补丁：`./gradlew applyPatches`
4. 创建重新混淆的 Paperclip 包：`./gradlew createReobfPaperclipJar`

## 👨‍💻 贡献

目前我们还没有制定明确的贡献指南。

如果你是社区中的一位玩家，你可以直接提交 Pull Request，前提是你认为你的修改是有意义且正确的。

## 📄️ 许可

对于 [PlutoProject/Leaves-PMC](https://github.com/PlutoProject/common) 中的大部分补丁，都在
[GNU Lesser General Public License v3.0](https://www.gnu.org/licenses/lgpl-3.0.html) 下许可。

部分补丁文件可能有例外，请查看 `licenses` 文件夹中的许可文件。

![license](lgpl-v3.png)